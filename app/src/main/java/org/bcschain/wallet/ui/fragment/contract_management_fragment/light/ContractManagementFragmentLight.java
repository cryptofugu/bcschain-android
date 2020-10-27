package org.bcschain.wallet.ui.fragment.contract_management_fragment.light;

import org.bcschain.wallet.model.contract.ContractMethod;
import org.bcschain.wallet.ui.fragment.contract_management_fragment.ContractManagementFragment;

import java.util.List;

public class ContractManagementFragmentLight extends ContractManagementFragment {

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_contract_management_light;
    }

    @Override
    public void setRecyclerView(List<ContractMethod> contractMethodList, boolean needToGetValue) {
        mMethodAdapter = new MethodAdapter(contractMethodList, org.bcschain.wallet.R.layout.item_contract_property_light, org.bcschain.wallet.R.layout.item_contract_method_light, needToGetValue);
        mRecyclerView.setAdapter(mMethodAdapter);
    }
}

