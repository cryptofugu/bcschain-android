package org.bcschain.wallet.ui.fragment.subscribe_tokens_fragment;

import org.bcschain.wallet.model.contract.Token;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentPresenter;

import java.util.List;

public interface AddressesListTokenPresenter extends BaseFragmentPresenter {
    void onSubscribeChanged(Token token);
}
