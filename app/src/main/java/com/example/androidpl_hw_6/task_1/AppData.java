package com.example.androidpl_hw_6.task_1;

import android.app.Application;

public class AppData extends Application {

     private static final String TAG = "AppData";
     private static GreenTask1 green;

    @Override
    public void onCreate() {
        super.onCreate();
        green = new GreenTask1();
    }

    public static GreenTask1 getGreen() {
        return green;
    }
}
