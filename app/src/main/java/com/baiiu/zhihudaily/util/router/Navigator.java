package com.baiiu.zhihudaily.util.router;

import android.content.Context;
import com.baiiu.zhihudaily.newsDetail.view.NewsDetailActivity;
import com.baiiu.zhihudaily.newsList.model.Story;

/**
 * author: baiiu
 * date: on 16/6/15 17:27
 * description:
 */
public enum Navigator {
    INSTANCE;

    public void navigatorToDetail(Context context, long id) {
        context.startActivity(NewsDetailActivity.instance(context, id));
    }

    public void navigatorToDetail(Context context, Story story) {
        context.startActivity(NewsDetailActivity.instance(context, story));
    }


}
