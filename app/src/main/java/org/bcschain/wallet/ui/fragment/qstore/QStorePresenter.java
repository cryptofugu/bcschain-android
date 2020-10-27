package org.bcschain.wallet.ui.fragment.qstore;

import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

public interface QStorePresenter extends BaseFragmentPresenter {
    void searchItems(String seacrhBarText, boolean checked);
}
