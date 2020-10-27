package org.bcschain.wallet.ui.fragment.qstore_by_type.dark;

import org.bcschain.wallet.model.gson.qstore.QSearchItem;
import org.bcschain.wallet.ui.fragment.qstore_by_type.QStoreByTypeFragment;
import org.bcschain.wallet.ui.fragment.qstore_by_type.StoreSearchAdapter;

import java.util.List;

public class QStoreByTypeFragmentDark extends QStoreByTypeFragment {

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.lyt_q_store;
    }

    @Override
    public void setSearchResult(List<QSearchItem> items) {
        searchAdapter = new StoreSearchAdapter(items, this, org.bcschain.wallet.R.layout.lyt_store_search_list_item);
        contentList.setAdapter(searchAdapter);
    }
}
