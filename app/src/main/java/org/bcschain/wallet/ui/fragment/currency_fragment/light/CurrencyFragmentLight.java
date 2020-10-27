package org.bcschain.wallet.ui.fragment.currency_fragment.light;

import org.bcschain.wallet.model.Currency;
import org.bcschain.wallet.ui.fragment.currency_fragment.CurrencyFragment;

import java.util.List;

public class CurrencyFragmentLight extends CurrencyFragment {

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_currency_light;
    }

    @Override
    public void setCurrencyList(List<Currency> currencyList) {
        mCurrencyAdapter = new CurrencyAdapter(currencyList, org.bcschain.wallet.R.layout.lyt_token_list_item_light);
        mCurrentList = currencyList;
        mRecyclerView.setAdapter(mCurrencyAdapter);
    }
}
