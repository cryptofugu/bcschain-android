package org.bcschain.wallet.ui.fragment.backup_contracts_fragment;

import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

interface BackupContractsPresenter extends BaseFragmentPresenter {
    void permissionGrantedForChooseShareMethod();

    void permissionGrantedForCreateAndBackUpFile();

    void permissionGrantedForCreateBackUpFile();

    void onBackUpClick();
}
