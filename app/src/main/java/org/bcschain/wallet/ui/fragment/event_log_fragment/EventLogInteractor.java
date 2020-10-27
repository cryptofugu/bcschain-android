package org.bcschain.wallet.ui.fragment.event_log_fragment;


import org.bcschain.wallet.model.gson.history.History;

public interface EventLogInteractor {
    History getHistory(String txHash);
}
