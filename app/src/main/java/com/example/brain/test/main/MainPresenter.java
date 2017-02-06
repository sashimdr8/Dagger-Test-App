package com.example.brain.test.main;

import com.example.brain.test.TestComponent;

/**
 * Created by brain on 2/6/17.
 */

public class MainPresenter implements MainContract.Presenter {
    private TestComponent component;
    private MainContract.View view;

    public MainPresenter(TestComponent component,MainContract.View view) {
        this.component = component;
        this.view = view;
        this.view.setPresenter(this);
    }
}
