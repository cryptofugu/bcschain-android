package org.bcschain.wallet.ui.fragment.addresses_detail_fragment;


import org.bcschain.wallet.model.gson.history.Vin;
import org.bcschain.wallet.model.gson.history.Vout;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;
import org.bcschain.wallet.ui.fragment.transaction_fragment.HistoryType;

import java.util.List;

interface AddressesDetailView extends BaseFragmentView{
    void setUpRecyclerView(List<Vin> transactionFrom, List<Vout> transactionTo, String symbol);
    String getTxHash();
    HistoryType getHistoryType();
    int getDecimalUnits();
    String getSymbol();
}
