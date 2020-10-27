package org.bcschain.wallet.ui.fragment.news_fragment.light;

import org.bcschain.wallet.R;
import org.bcschain.wallet.model.news.News;
import org.bcschain.wallet.ui.activity.main_activity.MainActivity;
import org.bcschain.wallet.ui.fragment.news_fragment.NewsFragment;

import java.util.List;

public class NewsFragmentLight extends NewsFragment {
    @Override
    protected int getLayout() {
        return org.bcschain.wallet.R.layout.fragment_news_light;
    }

    @Override
    public void initializeViews() {
        ((MainActivity) getActivity()).showBottomNavigationView(org.bcschain.wallet.R.color.title_color_light);
        super.initializeViews();
    }

    @Override
    public void updateNews(List<News> newses) {
        mNewsAdapter = new NewsAdapter(newses, R.layout.item_news_light);
        mRecyclerView.setAdapter(mNewsAdapter);
        mSwipeRefreshLayout.setRefreshing(false);
    }
}
