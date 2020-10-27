package org.bcschain.wallet.ui.fragment.profile_fragment;

import org.bcschain.wallet.datastorage.listeners.LanguageChangeListener;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenterImpl;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class ProfilePresenterImpl extends BaseFragmentPresenterImpl implements ProfilePresenter {

    private ProfileView mProfileView;
    private ProfileInteractor mProfileInteractor;
    private static List<SettingObject> settingsData;

    public ProfilePresenterImpl(ProfileView profileView, ProfileInteractor profileInteractor) {
        mProfileView = profileView;
        mProfileInteractor = profileInteractor;
        initSettingsData();
    }

    private void initSettingsData() {
        if (settingsData == null) {
            settingsData = new ArrayList<>();
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.language, org.bcschain.wallet.R.drawable.ic_language, 0));
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.change_pin, org.bcschain.wallet.R.drawable.ic_changepin, 1));
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.wallet_backup, org.bcschain.wallet.R.drawable.ic_backup, 1));
            if (getView().checkAvailabilityTouchId()) {
                settingsData.add(new SettingSwitchObject(org.bcschain.wallet.R.string.touch_id, org.bcschain.wallet.R.drawable.ic_touchid, 1,
                        getInteractor().isTouchIdEnable()));
            }
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.smart_contracts, org.bcschain.wallet.R.drawable.ic_prof_smartcontr, 2));
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.subscribe_tokens, org.bcschain.wallet.R.drawable.ic_tokensubscribe, 2));
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.about, org.bcschain.wallet.R.drawable.ic_about, 4));
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.switch_theme, org.bcschain.wallet.R.drawable.ic_prof_theme, 4));
            settingsData.add(new SettingObject(org.bcschain.wallet.R.string.log_out, org.bcschain.wallet.R.drawable.ic_logout, 4));
        }
    }

    public List<SettingObject> getSettingsData() {
        return settingsData;
    }

    @Override
    public ProfileView getView() {
        return mProfileView;
    }

    private ProfileInteractor getInteractor() {
        return mProfileInteractor;
    }

    @Override
    public void clearWallet() {
        getInteractor().clearWallet();
    }

    @Override
    public void onTouchIdSwitched(boolean isChecked) {
        getInteractor().saveTouchIdEnable(isChecked);
    }

    @Override
    public void setupLanguageChangeListener(LanguageChangeListener listener) {
        getInteractor().setupLanguageChangeListener(listener);
    }

    @Override
    public void removeLanguageListener(LanguageChangeListener listener) {
        getInteractor().removeLanguageListener(listener);
    }
}