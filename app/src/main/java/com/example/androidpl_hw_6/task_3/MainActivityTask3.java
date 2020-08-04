package com.example.androidpl_hw_6.task_3;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpl_hw_6.R;
import com.example.androidpl_hw_6.task_3.app.App;

import javax.inject.Inject;

public class MainActivityTask3 extends AppCompatActivity {

     private static final String TAG = "MainActivityTask3";

     @Inject
     GreenTask3 green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task3);

        App.getAppComponent().inject(this);

        Log.d(TAG, "MainActivityTask3: " + green.getNameClass());
        Log.d(TAG, "MainActivityTask3 hashCode green: " + green);

        RedTask3 red = new RedTask3();
        WhiteTask3 white = new WhiteTask3();

    }
}
