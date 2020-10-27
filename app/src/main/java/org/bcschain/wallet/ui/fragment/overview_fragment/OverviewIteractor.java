package org.bcschain.wallet.ui.fragment.overview_fragment;


import org.bcschain.wallet.model.gson.history.History;
import org.bcschain.wallet.model.gson.history.TransactionReceipt;
import org.bcschain.wallet.model.gson.token_history.TokenHistory;

public interface OverviewIteractor {
    History getHistory(String txHash);
    TokenHistory getTokenHistory(String txHash);
    TransactionReceipt getReceiptByRxhHashFromRealm(String txHash);
}
