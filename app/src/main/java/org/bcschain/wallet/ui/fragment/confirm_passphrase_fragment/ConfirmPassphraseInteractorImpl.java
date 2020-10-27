package org.bcschain.wallet.ui.fragment.confirm_passphrase_fragment;


import android.content.Context;

import org.bcschain.wallet.datastorage.KeyStorage;
import org.bcschain.wallet.datastorage.BCSSharedPreference;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

import rx.Observable;

public class ConfirmPassphraseInteractorImpl implements ConfirmPassphraseInteractor {

    WeakReference<Context> mContext;

    ConfirmPassphraseInteractorImpl(Context context){
        mContext = new WeakReference<Context>(context);
    }

    @Override
    public Observable<String> createWallet(final String passphrase) {
        return Observable.fromCallable(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return KeyStorage.getInstance().loadWallet(passphrase);
            }
        });
    }

    @Override
    public void setKeyGeneratedInstance(boolean isKeyGenerated) {
        BCSSharedPreference.getInstance().setKeyGeneratedInstance(mContext.get(), isKeyGenerated);
    }
}
