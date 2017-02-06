package com.example.brain.test;

import android.app.Application;
import android.content.Context;

/**
 * Created by brain on 2/6/17.
 */

public class TestApp extends Application {
    private TestComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        this.component = DaggerComponentInitializer.init(this);


    }

    private final static class DaggerComponentInitializer {

        static TestComponent init(Context context) {
            return DaggerTestComponent.builder().testModule(new TestModule(context.getApplicationContext())).build();

        }
    }

    public static TestComponent component(Context context) {
        return ((TestApp) context.getApplicationContext()).component;
    }

}
