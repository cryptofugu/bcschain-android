package org.bcschain.wallet.ui.fragment.pin_fragment;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

import org.bcschain.wallet.R;
import org.bcschain.wallet.utils.CryptoUtils;
import org.bcschain.wallet.utils.CryptoUtilsCompat;
import org.bcschain.wallet.utils.crypto.AESUtil;
import org.bcschain.wallet.utils.crypto.KeyStoreHelper;
import org.bcschain.wallet.datastorage.KeyStorage;
import org.bcschain.wallet.datastorage.BCSSharedPreference;

import java.util.concurrent.Callable;

import javax.crypto.Cipher;

import rx.Observable;

import static org.bcschain.wallet.utils.crypto.KeyStoreHelper.trimEndSpaces;

class PinInteractorImpl implements PinInteractor {

    private Context mContext;
    private final String BCS_PIN_ALIAS = "bcs_alias";

    PinInteractorImpl(Context context) {
        mContext = context;
    }

    @Override
    public String getPassword() {
        String sixDigitPassword = getSixDigitPassword();
        if (!TextUtils.isEmpty(sixDigitPassword)) {
            return trimEndSpaces(sixDigitPassword);
        } else {
            return trimEndSpaces(getFourDigitPassword());
        }
        //delete 4 spaces because after API 18 android have bug
        //(https://stackoverflow.com/questions/34472004/android-preferences-adding-unwanted-chars)
    }

    @Override
    public void savePassword(String password) {
        saveSixDigitPassword(password);
    }


    private String getFourDigitPassword() {
        String encryptedPinHash = BCSSharedPreference.getInstance().getPassword(mContext);
        return KeyStoreHelper.decrypt(BCS_PIN_ALIAS, encryptedPinHash);
    }

    @Override
    public String getSixDigitPassword() {
        return BCSSharedPreference.getInstance().getSixDigitPassword(mContext);
    }

    @Override
    public Integer getFailedAttemptsCount() {
        return BCSSharedPreference.getInstance().getFailedAttemptsCount(mContext);
    }

    @Override
    public Long getBanTime() {
        return BCSSharedPreference.getInstance().getBanTime(mContext);
    }

    @Override
    public void setFailedAttemptsCount(int failedAttemptsCount) {
        BCSSharedPreference.getInstance().setFailedAttemptsCount(mContext, failedAttemptsCount);
    }

    @Override
    public void setBanTime(long banTime) {
        BCSSharedPreference.getInstance().setBanTime(mContext, banTime);
    }

    @Override
    public void saveSixDigitPassword(String password) {
        BCSSharedPreference.getInstance().saveSixDigitPassword(mContext, password);
    }

    @Override
    public void savePassphraseSaltWithPin(String pin, String passphrase) {
        byte[] saltPassphrase = AESUtil.encryptToBytes(pin, passphrase);
        String encryptedSaltPassphrase = Base64.encodeToString(saltPassphrase, Base64.DEFAULT);
        BCSSharedPreference.getInstance().saveSeed(mContext, encryptedSaltPassphrase);
    }

    @Override
    public byte[] getSaltPassphrase() {
        String encryptedSaltPassphrase = BCSSharedPreference.getInstance().getSeed(mContext);
        return Base64.decode(encryptedSaltPassphrase, Base64.DEFAULT);
    }

    @Override
    public String getTouchIdPassword() {
        return BCSSharedPreference.getInstance().getTouchIdPassword(mContext);
    }

    @Override
    public void saveTouchIdPassword(String password) {
        BCSSharedPreference.getInstance().saveTouchIdPassword(mContext, password);
    }

    @Override
    public String getRandomSeed(){
        return KeyStorage.getInstance().getRandomSeed();
    }

    @Override
    public void setKeyGeneratedInstance(boolean isKeyGenerated) {
        BCSSharedPreference.getInstance().setKeyGeneratedInstance(mContext, isKeyGenerated);
    }

    @Override
    public String decode(String encoded, Cipher cipher) {
        return CryptoUtils.decode(encoded, cipher);
    }

    @Override
    public Observable<String> encodeInBackground(String pin) {
        return CryptoUtils.encodeInBackground(pin);
    }

    @Override
    public String generateSHA256String(String pin) {
        return CryptoUtilsCompat.generateSHA256String(pin);
    }

    @Override
    public String getUnSaltPassphrase(String oldPin) {
        byte[] oldSaltPassphrase = getSaltPassphrase();
        return AESUtil.decryptBytes(oldPin, oldSaltPassphrase);
    }

    @Override
    public String getBanPinString(int min) {
        return mContext.getString(R.string.sorry_please_try_again_in) + " " + min + " " + mContext.getString(R.string.minutes);
    }

    @Override
    public Observable<String> loadWallet(final String code) {
        return Observable.fromCallable(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return KeyStorage.getInstance().loadWallet(KeyStoreHelper.getSeed(mContext, code));
            }
        });
    }

}