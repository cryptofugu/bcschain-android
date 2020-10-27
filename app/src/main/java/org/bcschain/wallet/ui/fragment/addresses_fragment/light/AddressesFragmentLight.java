package org.bcschain.wallet.ui.fragment.addresses_fragment.light;

import org.bcschain.wallet.R;
import org.bcschain.wallet.ui.fragment.addresses_fragment.AddressesFragment;
import org.bitcoinj.crypto.DeterministicKey;

import java.util.List;

public class AddressesFragmentLight extends AddressesFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_addresses_light;
    }

    @Override
    public void updateAddressList(List<String> deterministicKeys) {
        mAddressAdapter = new AddressesAdapterLight(deterministicKeys, this);
        mRecyclerView.setAdapter(mAddressAdapter);
    }
}
