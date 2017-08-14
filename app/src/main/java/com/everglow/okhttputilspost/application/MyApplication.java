package com.everglow.okhttputilspost.application;
import android.app.Application;

/**
 * Created by EverGlow on 2017/8/14 11:23
 */

public  class MyApplication extends Application   {

    public static MyApplication app;
    @Override
    public void onCreate() {
        super.onCreate();
            app = this;
    }
}
