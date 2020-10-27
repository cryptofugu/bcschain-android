package org.bcschain.wallet.ui.fragment.template_library_fragment;

import org.bcschain.wallet.model.ContractTemplate;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface TemplateLibraryView extends BaseFragmentView {

    void setUpTemplateList(List<ContractTemplate> contractTemplateList);

}
