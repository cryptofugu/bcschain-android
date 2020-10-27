package org.bcschain.wallet.ui.fragment.about_fragment;

import org.bcschain.wallet.model.Version;
import org.bcschain.wallet.ui.base.base_fragment.BaseFragmentView;

public interface AboutView extends BaseFragmentView {
    void updateVersion(Version version);
}
