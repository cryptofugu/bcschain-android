package org.bcschain.wallet.ui.base.base_fragment;

import org.bcschain.wallet.ui.base.base_activity.BasePresenter;

public interface BaseFragmentPresenter extends BasePresenter {
    void onViewCreated();

    void onDestroyView();
}
