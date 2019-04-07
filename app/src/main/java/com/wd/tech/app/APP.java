package com.wd.tech.app;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
