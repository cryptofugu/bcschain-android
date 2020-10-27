package org.bcschain.wallet.ui.fragment.my_contracts_fragment;

import org.bcschain.wallet.model.contract.Contract;

public interface ContractItemListener {
    void onUnsubscribeClick(Contract contract);
}
