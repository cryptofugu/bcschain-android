package org.bcschain.wallet.ui.fragment.event_log_fragment.light;

import org.bcschain.wallet.R;
import org.bcschain.wallet.model.gson.history.Log;
import org.bcschain.wallet.ui.fragment.event_log_fragment.EventLogFragment;

import java.util.List;


public class EventLogFragmentLight extends EventLogFragment{

    @Override
    protected int getLayout() {
        return R.layout.fragment_event_log_light;
    }

    @Override
    public void updateEventLog(List<Log> logs) {
        mEventLogAdapter = new EventLogAdapter(logs, R.layout.item_event_log_light, R.layout.item_event_log_data_light);
        mRecyclerViewLogs.setAdapter(mEventLogAdapter);
    }
}
