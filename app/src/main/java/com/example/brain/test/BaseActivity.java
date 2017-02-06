package com.example.brain.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.brain.test.data.AppData;

import javax.inject.Inject;

/**
 * Created by brain on 2/6/17.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Inject
    protected AppData data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestApp.component(this).inject(this);

    }
}
