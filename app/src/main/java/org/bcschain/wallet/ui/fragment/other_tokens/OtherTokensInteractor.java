package org.bcschain.wallet.ui.fragment.other_tokens;

import org.bcschain.wallet.model.contract.Token;

import java.util.List;

import rx.Observable;

public interface OtherTokensInteractor {
    Observable<List<Token>> getTokenObservable();
}
