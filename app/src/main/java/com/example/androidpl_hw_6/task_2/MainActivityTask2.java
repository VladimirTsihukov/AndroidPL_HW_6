package com.example.androidpl_hw_6.task_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpl_hw_6.R;

public class MainActivityTask2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task2);

        GreenTask2 green = new GreenTask2();
        WhiteTask2 white = new WhiteTask2(green);
        RedTask2 red = new RedTask2(green);
    }
}
