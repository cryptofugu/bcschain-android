package org.bcschain.wallet.ui.fragment.language_fragment;

import android.content.Context;
import android.util.Pair;

import org.bcschain.wallet.datastorage.BCSSettingSharedPreference;
import org.bcschain.wallet.datastorage.BCSSharedPreference;
import org.bcschain.wallet.datastorage.listeners.LanguageChangeListener;

import java.util.ArrayList;
import java.util.List;

class LanguageInteractorImpl implements LanguageInteractor {

    private Context mContext;
    private List<Pair<String, String>> mLanguagesList;

    LanguageInteractorImpl(Context context) {
        mContext = context;
        mLanguagesList = new ArrayList<>();
        mLanguagesList.add(new Pair<>("en", "English"));
		mLanguagesList.add(new Pair<>("ru", "Russian"));
        mLanguagesList.add(new Pair<>("zh", "Chinese"));
    }

    @Override
    public String getLanguage() {
        return BCSSettingSharedPreference.getInstance().getLanguage(mContext);
    }

    @Override
    public void setLanguage(String language) {
        BCSSettingSharedPreference.getInstance().saveLanguage(mContext, language);
    }

    @Override
    public List<Pair<String, String>> getLanguagesList() {
        return mLanguagesList;
    }

    @Override
    public void removeLanguageListener(LanguageChangeListener languageChangeListener) {
        BCSSettingSharedPreference.getInstance().removeLanguageListener(languageChangeListener);
    }

    @Override
    public void addLanguageListener(LanguageChangeListener languageChangeListener) {
        BCSSettingSharedPreference.getInstance().addLanguageListener(languageChangeListener);
    }
}