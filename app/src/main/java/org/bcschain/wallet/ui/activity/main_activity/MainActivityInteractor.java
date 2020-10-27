package org.bcschain.wallet.ui.activity.main_activity;

import org.bcschain.wallet.datastorage.listeners.LanguageChangeListener;
import org.bcschain.wallet.model.gson.DGPInfo;
import org.bcschain.wallet.model.gson.FeePerKb;

import rx.Observable;

public interface MainActivityInteractor {
    boolean getKeyGeneratedInstance();

    void clearStatic();

    Observable<FeePerKb> getFeePerKb();

    Observable<DGPInfo> getDGPInfo();

    boolean isDGPInfoLoaded();

    boolean isFeePerkbLoaded();

    void setDGPInfo(DGPInfo dgpInfo);

    void setFeePerKb(FeePerKb feePerKb);

    void addLanguageChangeListener(LanguageChangeListener languageChangeListener);

    void removeLanguageChangeListener(LanguageChangeListener languageChangeListener);
}
