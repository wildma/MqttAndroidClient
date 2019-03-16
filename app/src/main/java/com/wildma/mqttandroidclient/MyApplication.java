package com.wildma.mqttandroidclient;

import android.app.Application;
import android.content.Context;

/**
 * Desc	        ${MyApplication}
 */
public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }
}
