package com.example.androidpl_hw_6.task_1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpl_hw_6.R;

public class MainActivityTask1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task_1);

        RedTask1 red = new RedTask1();
        WhiteTask1 white = new WhiteTask1();
    }
}
