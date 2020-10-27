package org.bcschain.wallet.ui.fragment.about_fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import org.bcschain.wallet.model.Version;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragment;
import org.bcschain.wallet.ui.fragment_factory.Factory;
import org.bcschain.wallet.utils.FontTextView;

import butterknife.BindView;
import butterknife.OnClick;

public abstract class AboutFragment extends BaseFragment implements AboutView {

    AboutPresenter mAboutFragmentPresenter;

    @OnClick({org.bcschain.wallet.R.id.ibt_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case org.bcschain.wallet.R.id.ibt_back:
                getActivity().onBackPressed();
                break;
        }
    }

    @BindView(org.bcschain.wallet.R.id.tv_bcs_version)
    FontTextView mTextViewBCSVersion;

    public static BaseFragment newInstance(Context context) {
        Bundle args = new Bundle();
        BaseFragment fragment = Factory.instantiateFragment(context, AboutFragment.class);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void updateVersion(Version version) {
        String footer = getString(org.bcschain.wallet.R.string._2017_bcs_n_skynet_testnet_version) + "Version " + version.getVersionName() + "(" + String.valueOf(version.getVersionCode()) + ")";
        mTextViewBCSVersion.setText(footer);
    }

    @Override
    protected void createPresenter() {
        mAboutFragmentPresenter = new AboutPresenterImpl(this, new AboutInteractorImpl(getContext()));
    }

    @Override
    protected AboutPresenter getPresenter() {
        return mAboutFragmentPresenter;
    }
}