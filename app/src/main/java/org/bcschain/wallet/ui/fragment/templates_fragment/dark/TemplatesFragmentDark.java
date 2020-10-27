package org.bcschain.wallet.ui.fragment.templates_fragment.dark;

import org.bcschain.wallet.model.ContractTemplate;
import org.bcschain.wallet.ui.fragment.templates_fragment.TemplatesFragment;

import java.util.List;

public class TemplatesFragmentDark extends TemplatesFragment {

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_templates;
    }

    @Override
    public void setUpTemplateList(List<ContractTemplate> contractTemplateList) {
        initializeRecyclerView(contractTemplateList, org.bcschain.wallet.R.layout.item_template);
    }
}
