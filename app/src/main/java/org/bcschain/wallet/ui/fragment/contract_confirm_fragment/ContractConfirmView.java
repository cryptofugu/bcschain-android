package org.bcschain.wallet.ui.fragment.contract_confirm_fragment;

import org.bcschain.wallet.BCSApplication;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

public interface ContractConfirmView extends BaseFragmentView {

    void makeToast(String s);

    BCSApplication getApplication();

    String getContractName();

    void updateFee(double minFee, double maxFee);

    void updateGasPrice(int minGasPrice, int maxGasPrice);

    void updateGasLimit(int minGasLimit, int maxGasLimit);

    void closeFragments();
}
