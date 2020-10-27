package org.bcschain.wallet.ui.fragment.transaction_fragment;

import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

interface TransactionPresenter extends BaseFragmentPresenter {
    void openTransactionView(String txHash, HistoryType historyType);
}
