package com.ziv.video.app;

import android.app.Application;
import android.content.Context;

public class VideoApplication extends Application {

    public static Context applicaContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicaContext = this;
    }
}
