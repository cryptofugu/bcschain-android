package org.bcschain.wallet.ui.fragment.event_log_fragment;

import org.bcschain.wallet.model.gson.history.Log;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;


public interface EventLogView extends BaseFragmentView {
    String getTxHash();
    void updateEventLog(List<Log> logs);
}
