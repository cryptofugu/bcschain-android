package org.bcschain.wallet.ui.fragment.store_categories.dark;

import org.bcschain.wallet.R;
import org.bcschain.wallet.model.gson.QstoreContractType;
import org.bcschain.wallet.ui.fragment.store_categories.StoreCategoriesAdapter;
import org.bcschain.wallet.ui.fragment.store_categories.StoreCategoriesFragment;
import org.bcschain.wallet.ui.fragment.store_categories.StoreCategoryViewHolder;

import java.util.List;

public class StoreCategoriesFragmentDark extends StoreCategoriesFragment {

    @Override
    protected int getLayout() {
        return R.layout.lyt_store_categories;
    }

    @Override
    public void setUpCategoriesList(List<QstoreContractType> list, StoreCategoryViewHolder.OnCategoryClickListener listener) {
        adapter = new StoreCategoriesAdapter(list, R.layout.lyt_store_category_list_item, listener);
        contentList.setAdapter(adapter);
    }
}
