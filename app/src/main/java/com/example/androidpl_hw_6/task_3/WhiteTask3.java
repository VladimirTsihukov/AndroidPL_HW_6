package com.example.androidpl_hw_6.task_3;

import android.util.Log;

import com.example.androidpl_hw_6.task_3.app.App;

import javax.inject.Inject;

public class WhiteTask3 {

     private static final String TAG = "WhiteTask3";

     @Inject
    GreenTask3 green;

    public WhiteTask3() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "WhiteTask3: " + green.getNameClass());
        Log.d(TAG, "WhiteTask3 hashCode green: " + green);
    }
}
