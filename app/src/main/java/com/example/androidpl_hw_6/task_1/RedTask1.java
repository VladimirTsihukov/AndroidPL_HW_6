package com.example.androidpl_hw_6.task_1;

import android.util.Log;

public class RedTask1 {
    private static final String TAG = "RedTask1";

    public RedTask1() {
        Log.d(TAG, "Class RedTask1: " + AppData.getGreen().getNameClass());
        Log.d(TAG, "hashCod GreenTask1 in class RedTask1: " + AppData.getGreen());
    }
}
