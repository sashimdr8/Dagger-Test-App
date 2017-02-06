package com.example.brain.test;

import android.content.Context;

import com.example.brain.test.data.AppData;
import com.example.brain.test.data.LocalRepo;
import com.example.brain.test.data.RemoteRepo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by brain on 2/6/17.
 */
@Module
public class TestModule {
    private final Context app;


    public TestModule(Context app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public AppData provideData(LocalRepo localRepo, RemoteRepo remoteRepo){
        return new AppData(localRepo,remoteRepo);
    }
}
