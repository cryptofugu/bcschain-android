package org.bcschain.wallet.ui.fragment.currency_fragment;

import org.bcschain.wallet.model.Currency;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface CurrencyView extends BaseFragmentView {
    void setCurrencyList(List<Currency> currencyList);
}
