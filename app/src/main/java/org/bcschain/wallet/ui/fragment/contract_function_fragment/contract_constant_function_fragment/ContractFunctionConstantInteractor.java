package org.bcschain.wallet.ui.fragment.contract_function_fragment.contract_constant_function_fragment;

import org.bcschain.wallet.model.contract.Contract;
import org.bcschain.wallet.model.contract.ContractMethod;
import org.bcschain.wallet.model.contract.ContractMethodParameter;
import org.bcschain.wallet.model.gson.SendRawTransactionResponse;
import org.bcschain.wallet.model.gson.UnspentOutput;

import java.math.BigDecimal;
import java.util.List;

import rx.Observable;

public interface ContractFunctionConstantInteractor {
    List<ContractMethod> getContractMethod(String contractTemplateUiid);

    BigDecimal getFeePerKb();

    int getMinGasPrice();

    Observable<ContractFunctionConstantInteractorImpl.CallSmartContractRespWrapper> callSmartContractObservable(String methodName,
                                                                                                        List<ContractMethodParameter> contractMethodParameterList,
                                                                                                        Contract contract);

    Contract getContractByAddress(String address);
}
