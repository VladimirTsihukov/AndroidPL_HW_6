package com.example.androidpl_hw_6.task_2;

import android.util.Log;

public class RedTask2 {

     private static final String TAG = "RedTask2";

    public RedTask2(GreenTask2 green) {
        Log.d(TAG, "Class RedTask2: " + green.getNameClass());
        Log.d(TAG, "hashCod GreenTask1 in class RedTask2: " + green);
    }
}
