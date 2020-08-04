package com.example.androidpl_hw_6.task_3.app;

import com.example.androidpl_hw_6.task_3.MainActivityTask3;
import com.example.androidpl_hw_6.task_3.RedTask3;
import com.example.androidpl_hw_6.task_3.WhiteTask3;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainActivityTask3 mainActivity);

    void inject(RedTask3 red);

    void inject(WhiteTask3 white);
}
