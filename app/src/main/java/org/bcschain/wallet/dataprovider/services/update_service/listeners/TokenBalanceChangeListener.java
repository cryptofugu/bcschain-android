package org.bcschain.wallet.dataprovider.services.update_service.listeners;

import org.bcschain.wallet.model.gson.token_balance.TokenBalance;

public interface TokenBalanceChangeListener {
    void onBalanceChange(TokenBalance tokenBalance);
}
