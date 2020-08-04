package com.example.androidpl_hw_6.task_3;

import android.util.Log;

import com.example.androidpl_hw_6.task_3.app.App;

import javax.inject.Inject;

public class RedTask3 {

     private static final String TAG = "RedTask3";

     @Inject
     GreenTask3 green;

     public RedTask3() {
          App.getAppComponent().inject(this);
          Log.d(TAG, "RedTask3: " + green.getNameClass());
          Log.d(TAG, "RedTask3 hashCode green: " + green);
     }
}
