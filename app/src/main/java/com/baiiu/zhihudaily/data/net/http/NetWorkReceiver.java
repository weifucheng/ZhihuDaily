package com.baiiu.zhihudaily.data.net.http;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.baiiu.zhihudaily.data.net.util.HttpNetUtil;


/**
 * Created by baiiu on 15/11/17.
 * 监听网络变化.
 */
public class NetWorkReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (HttpNetUtil.setConnected()) {
            //if turns to true, show post event to refresh UI
        }


    }

}