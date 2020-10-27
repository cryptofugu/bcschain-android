package org.bcschain.wallet.ui.fragment.news_detail_fragment;

import org.bcschain.wallet.model.news.News;

public interface NewsDetailInteractor {
    News getNews(int newsPosition);
}
