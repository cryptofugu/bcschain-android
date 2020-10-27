package org.bcschain.wallet.ui.fragment.contract_management_fragment;

import org.bcschain.wallet.model.contract.Contract;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

public interface ContractManagementPresenter extends BaseFragmentPresenter {
    Contract getContractByAddress(String contractAddress);
}
