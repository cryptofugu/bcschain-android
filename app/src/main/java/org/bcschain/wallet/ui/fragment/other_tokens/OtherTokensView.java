package org.bcschain.wallet.ui.fragment.other_tokens;

import org.bcschain.wallet.model.contract.Token;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface OtherTokensView extends BaseFragmentView {
    void setTokensData(List<Token> tokensData);

    void updateTokensData(List<Token> tokensData);
}
