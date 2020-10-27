package org.bcschain.wallet.ui.fragment.templates_fragment;

import org.bcschain.wallet.model.ContractTemplate;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface TemplatesView extends BaseFragmentView {
    void setUpTemplateList(List<ContractTemplate> contractTemplateList);
}
