package com.tag.myapplication;

import android.app.Application;
import android.util.Log;

public class sampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("App", "oncreate");
    }
}
