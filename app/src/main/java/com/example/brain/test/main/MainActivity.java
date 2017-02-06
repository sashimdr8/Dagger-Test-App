package com.example.brain.test.main;

import android.os.Bundle;

import com.example.brain.test.BaseActivity;
import com.example.brain.test.R;
import com.example.brain.test.TestApp;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenter(TestApp.component(this),this);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

        this.presenter = presenter;
    }

    @Override
    public boolean consumeBackPress() {
        return false;
    }
}
