package org.bcschain.wallet.ui.fragment.import_wallet_fragment;

import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

interface ImportWalletPresenter extends BaseFragmentPresenter {
    void onImportClick(String brainCode);

    void onPassphraseChange(String passphrase);
}
