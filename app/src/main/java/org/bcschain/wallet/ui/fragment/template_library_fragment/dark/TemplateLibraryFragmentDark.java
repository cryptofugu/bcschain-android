package org.bcschain.wallet.ui.fragment.template_library_fragment.dark;

import org.bcschain.wallet.model.ContractTemplate;
import org.bcschain.wallet.ui.fragment.template_library_fragment.TemplateLibraryFragment;

import java.util.List;

public class TemplateLibraryFragmentDark extends TemplateLibraryFragment {

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_template_library;
    }

    @Override
    public void setUpTemplateList(List<ContractTemplate> contractTemplateList) {
        initializeRecyclerView(contractTemplateList, org.bcschain.wallet.R.layout.item_template);
    }
}
