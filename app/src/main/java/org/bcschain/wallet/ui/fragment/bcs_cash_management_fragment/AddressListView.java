package org.bcschain.wallet.ui.fragment.bcs_cash_management_fragment;

import org.bcschain.wallet.model.AddressWithBalance;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface AddressListView extends BaseFragmentView {
    void updateAddressList(List<AddressWithBalance> deterministicKeyWithBalance);
}
