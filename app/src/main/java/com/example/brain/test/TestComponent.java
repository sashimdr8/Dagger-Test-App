package com.example.brain.test;

import com.example.brain.test.data.AppData;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by brain on 2/6/17.
 */
@Singleton
@Component(modules = {TestModule.class})
public interface TestComponent {

    AppData provideData();

    void inject(BaseActivity baseActivity);
}
