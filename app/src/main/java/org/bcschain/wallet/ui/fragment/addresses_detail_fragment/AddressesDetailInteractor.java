package org.bcschain.wallet.ui.fragment.addresses_detail_fragment;


import org.bcschain.wallet.model.gson.history.History;
import org.bcschain.wallet.model.gson.token_history.TokenHistory;


public interface AddressesDetailInteractor {
    History getHistory(String txHash);
    TokenHistory getTokenHistory(String txHash);
}
