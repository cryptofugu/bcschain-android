package org.bcschain.wallet.ui.fragment.addresses_detail_fragment.light;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bcschain.wallet.model.gson.history.TransactionInfo;
import org.bcschain.wallet.ui.fragment.addresses_detail_fragment.AddressesDetailAdapter;
import org.bcschain.wallet.ui.fragment.addresses_detail_fragment.AddressesDetailHolder;

import java.util.List;

class AddressesDetailAdapterLight<T extends TransactionInfo> extends AddressesDetailAdapter {

    protected AddressesDetailAdapterLight(List<T> transactionInfoList, String symbol) {
        super(transactionInfoList, symbol);
    }

    @Override
    public AddressesDetailHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(org.bcschain.wallet.R.layout.item_transaction_detail_light, parent, false);
        return new AddressesDetailHolder(view);
    }
}
