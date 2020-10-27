package org.bcschain.wallet.ui.fragment.set_your_token_fragment;

import org.bcschain.wallet.model.contract.ContractMethod;

public interface SetYourTokenInteractor {
    ContractMethod getContractConstructor(String uiid);
}
