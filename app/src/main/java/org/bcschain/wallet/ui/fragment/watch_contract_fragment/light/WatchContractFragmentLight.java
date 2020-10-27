package org.bcschain.wallet.ui.fragment.watch_contract_fragment.light;

import org.bcschain.wallet.model.ContractTemplate;
import org.bcschain.wallet.ui.fragment.watch_contract_fragment.OnTemplateClickListener;
import org.bcschain.wallet.ui.fragment.watch_contract_fragment.TemplatesAdapter;
import org.bcschain.wallet.ui.fragment.watch_contract_fragment.WatchContractFragment;
import org.bcschain.wallet.utils.FontManager;

import java.util.List;

public class WatchContractFragmentLight extends WatchContractFragment {

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_watch_contract_light;
    }

    @Override
    public void initializeViews() {
        super.initializeViews();
        mEditTextContractName.setTypeface(FontManager.getInstance().getFont(getResources().getString(org.bcschain.wallet.R.string.proximaNovaSemibold)));
        mEditTextContractAddress.setTypeface(FontManager.getInstance().getFont(getResources().getString(org.bcschain.wallet.R.string.proximaNovaSemibold)));
    }

    @Override
    public void setUpTemplatesList(List<ContractTemplate> contractTemplateList, OnTemplateClickListener listener) {
        mRecyclerViewTemplates.setAdapter(new TemplatesAdapter(contractTemplateList, listener, org.bcschain.wallet.R.layout.item_template_chips_light, org.bcschain.wallet.R.drawable.chip_selected_corner_background));
    }
}
