package org.bcschain.wallet.ui.fragment.receive_fragment.dark;

import android.support.v4.content.ContextCompat;
import android.view.View;

import org.bcschain.wallet.R;
import org.bcschain.wallet.ui.fragment.receive_fragment.ReceiveFragment;

import butterknife.BindView;

public class ReceiveFragmentDark extends ReceiveFragment {

    @BindView(R.id.qr_code_boarder)
    View qrCodeBoarder;

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_receive;
    }

    @Override
    public void initializeViews() {
        super.initializeViews();
        setQrColors(ContextCompat.getColor(getContext(), org.bcschain.wallet.R.color.colorPrimary), ContextCompat.getColor(getContext(), org.bcschain.wallet.R.color.background));
    }
}
