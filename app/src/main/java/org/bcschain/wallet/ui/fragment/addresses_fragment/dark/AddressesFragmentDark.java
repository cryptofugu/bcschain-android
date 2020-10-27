package org.bcschain.wallet.ui.fragment.addresses_fragment.dark;

import org.bcschain.wallet.R;
import org.bcschain.wallet.ui.fragment.addresses_fragment.AddressesFragment;
import org.bitcoinj.crypto.DeterministicKey;

import java.util.List;

public class AddressesFragmentDark extends AddressesFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_addresses;
    }

    @Override
    public void updateAddressList(List<String> deterministicKeys) {
        mAddressAdapter = new AddressesAdapterDark(deterministicKeys, this);
        mRecyclerView.setAdapter(mAddressAdapter);
    }
}
