package org.bcschain.wallet.ui.fragment.watch_token_fragment;

import org.bcschain.wallet.model.ContractTemplate;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

public interface WatchTokenPresenter extends BaseFragmentPresenter {

    void onOkClick(String name, String address);

    void onContractAddressEntered(String contractAddress);

}
