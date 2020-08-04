package com.example.androidpl_hw_6.task_2;

import android.util.Log;

public class WhiteTask2 {
    private static final String TAG = "WhiteTask2";

    public WhiteTask2(GreenTask2 green) {
        Log.d(TAG, "Class WhiteTask2: " + green.getNameClass());
        Log.d(TAG, "hashCod GreenTask1 in class WhiteTask2: " + green);
    }
}
