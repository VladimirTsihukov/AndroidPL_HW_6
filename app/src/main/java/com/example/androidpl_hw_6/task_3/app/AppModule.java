package com.example.androidpl_hw_6.task_3.app;

import android.app.Application;

import com.example.androidpl_hw_6.task_3.GreenTask3;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Application application;


    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    GreenTask3 providerGreen() {
        return new GreenTask3();
    }
}
