package org.bcschain.wallet.ui.fragment.wallet_fragment;

import org.bcschain.wallet.model.gson.history.History;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

import java.util.List;

public interface WalletPresenter extends BaseFragmentPresenter {

    void onTransactionClick(String txHash);

    void onLastItem(int currentItemCount);

    void onNetworkStateChanged(boolean networkConnectedFlag);

    void onNewHistory(History history);

    boolean getVisibility();

    void updateVisibility(boolean value);

}
