package org.bcschain.wallet.ui.fragment.watch_contract_fragment;

import org.bcschain.wallet.model.ContractTemplate;

public interface OnTemplateClickListener {
    void updateSelection(int adapterPosition);

    void onTemplateClick(ContractTemplate contractTemplate);
}
