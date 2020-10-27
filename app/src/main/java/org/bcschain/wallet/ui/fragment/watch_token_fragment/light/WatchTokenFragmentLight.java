package org.bcschain.wallet.ui.fragment.watch_token_fragment.light;

import org.bcschain.wallet.model.ContractTemplate;
import org.bcschain.wallet.ui.fragment.watch_contract_fragment.OnTemplateClickListener;
import org.bcschain.wallet.ui.fragment.watch_contract_fragment.TemplatesAdapter;
import org.bcschain.wallet.ui.fragment.watch_contract_fragment.WatchContractFragment;
import org.bcschain.wallet.ui.fragment.watch_token_fragment.WatchTokenFragment;
import org.bcschain.wallet.utils.FontManager;

import java.util.List;

public class WatchTokenFragmentLight extends WatchTokenFragment {

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_watch_token_light;
    }

    @Override
    public void initializeViews() {
        super.initializeViews();
        mEditTextContractName.setTypeface(FontManager.getInstance().getFont(getResources().getString(org.bcschain.wallet.R.string.proximaNovaSemibold)));
        mEditTextContractAddress.setTypeface(FontManager.getInstance().getFont(getResources().getString(org.bcschain.wallet.R.string.proximaNovaSemibold)));
    }

}
