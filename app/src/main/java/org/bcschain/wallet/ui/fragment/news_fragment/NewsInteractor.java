package org.bcschain.wallet.ui.fragment.news_fragment;

import org.bcschain.wallet.model.news.News;
import org.bcschain.wallet.model.news.RssFeed;

import java.util.List;

import rx.Observable;

public interface NewsInteractor {

    Observable<RssFeed> getMediumRssFeed();

    List<News> getNewses();

    void setNewses(List<News> newses);

    void unSubscribe();
}
