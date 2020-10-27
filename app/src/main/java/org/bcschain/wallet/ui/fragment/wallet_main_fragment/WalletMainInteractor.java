package org.bcschain.wallet.ui.fragment.wallet_main_fragment;

import org.bcschain.wallet.model.contract.Token;

import java.util.List;

import rx.Observable;

public interface WalletMainInteractor {
    Observable<List<Token>> getTokensObservable();
}
