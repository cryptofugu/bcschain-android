package org.bcschain.wallet.dataprovider.services.update_service.listeners;

import org.bcschain.wallet.model.gson.history.History;

public interface TransactionListener {
    void onNewHistory(History history);

    boolean getVisibility();
}
