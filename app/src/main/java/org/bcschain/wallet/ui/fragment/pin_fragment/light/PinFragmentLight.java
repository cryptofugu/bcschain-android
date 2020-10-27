package org.bcschain.wallet.ui.fragment.pin_fragment.light;

import org.bcschain.wallet.R;
import org.bcschain.wallet.ui.activity.main_activity.MainActivity;
import org.bcschain.wallet.ui.fragment.pin_fragment.PinFragment;
import org.bcschain.wallet.ui.wave_visualizer.WaveHelper;
import org.bcschain.wallet.ui.wave_visualizer.WaveView;

import butterknife.BindView;

public class PinFragmentLight extends PinFragment {

    @BindView(org.bcschain.wallet.R.id.wave_view)
    WaveView waveView;
    private WaveHelper mWaveHelper;

    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_pin_light;
    }

    @Override
    public void initializeViews() {
        super.initializeViews();
        waveView.setShapeType(WaveView.ShapeType.SQUARE);
        mWaveHelper = new WaveHelper(waveView);
    }

    @Override
    public void onResume() {
        super.onResume();
        mWaveHelper.start();
    }

    @Override
    public void onPause() {
        mWaveHelper.cancel();
        super.onPause();
    }

    @Override
    public int getThemedStatusBarColor() {
        return R.color.title_color_light;
    }
}
