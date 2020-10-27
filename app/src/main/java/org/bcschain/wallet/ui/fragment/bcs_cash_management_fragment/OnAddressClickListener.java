package org.bcschain.wallet.ui.fragment.bcs_cash_management_fragment;

import org.bcschain.wallet.model.AddressWithBalance;

public interface OnAddressClickListener {
    void onItemClick(AddressWithBalance deterministicKeyWithBalance);
}
