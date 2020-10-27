package org.bcschain.wallet.ui.fragment.subscribe_tokens_fragment;

import org.bcschain.wallet.model.contract.Token;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface SubscribeTokensView extends BaseFragmentView {

    void setTokenList(List<Token> tokenList);

    void setPlaceHolder();
}
