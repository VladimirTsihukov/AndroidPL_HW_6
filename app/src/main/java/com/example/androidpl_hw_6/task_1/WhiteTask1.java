package com.example.androidpl_hw_6.task_1;

import android.util.Log;

public class WhiteTask1 {

     private static final String TAG = "WhiteTask1";

    public WhiteTask1() {
        Log.d(TAG, "Class WhiteTask1: " + AppData.getGreen().getNameClass());
        Log.d(TAG, "hashCod GreenTask1 in WhiteTask1: " + AppData.getGreen());
    }
}
