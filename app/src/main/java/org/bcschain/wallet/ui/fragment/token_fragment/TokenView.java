package org.bcschain.wallet.ui.fragment.token_fragment;

import org.bcschain.wallet.model.contract.Token;
import org.bcschain.wallet.model.gson.history.History;
import org.bcschain.wallet.model.gson.token_history.TokenHistory;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;
import org.bcschain.wallet.utils.ContractManagementHelper;

import java.util.List;

import javax.annotation.Nullable;

import io.realm.OrderedCollectionChangeSet;
import io.realm.Realm;
import rx.Subscriber;

public interface TokenView extends BaseFragmentView {
    void setBalance(String balance);

    void setTokenAddress(String address);

    void setBCSAddress(String address);

    void onContractPropertyUpdated(String propName, String propValue);

    void setSenderAddress(String address);

    String getCurrency();

    boolean isAbiEmpty(String abi);

    Subscriber<String> getNameValueCallback();

    Subscriber<String> getSymbolValueCallback();

    Subscriber<String> getDecimalsValueCallback();

    Subscriber<String> getTotalSupplyValueCallback();

    void updateHistory(List<TokenHistory> histories, @Nullable OrderedCollectionChangeSet changeSet, int visibleItemCount);

    void updateHistory(List<TokenHistory> histories, int startIndex, int insertCount);

    void showBottomLoader();

    void hideBottomLoader();

    void clearAdapter();

    void offlineModeView();

    void onlineModeView();

    Realm getRealm();
}
