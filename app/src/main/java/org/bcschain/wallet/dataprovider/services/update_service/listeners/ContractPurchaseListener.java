package org.bcschain.wallet.dataprovider.services.update_service.listeners;

import org.bcschain.wallet.model.gson.qstore.ContractPurchase;

public interface ContractPurchaseListener {
    void onContractPurchased(ContractPurchase purchaseData);
}
