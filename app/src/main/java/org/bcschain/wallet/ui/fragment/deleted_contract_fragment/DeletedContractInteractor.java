package org.bcschain.wallet.ui.fragment.deleted_contract_fragment;


import org.bcschain.wallet.model.contract.Contract;
import org.bcschain.wallet.model.contract.Token;

import java.util.List;

public interface DeletedContractInteractor {

    List<Contract> getContractsWithoutTokens();

    List<Token> getTokens();

    void setContractWithoutTokens(List<Contract> contracts);

    void setTokens(List<Token> tokens);

}
