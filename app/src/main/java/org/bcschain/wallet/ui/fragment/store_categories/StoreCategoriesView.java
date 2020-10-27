package org.bcschain.wallet.ui.fragment.store_categories;

import org.bcschain.wallet.model.gson.QstoreContractType;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface StoreCategoriesView extends BaseFragmentView {
    void setUpCategoriesList(List<QstoreContractType> list, StoreCategoryViewHolder.OnCategoryClickListener listener);
}
