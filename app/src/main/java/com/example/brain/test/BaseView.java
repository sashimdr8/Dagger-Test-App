package com.example.brain.test;

/**
 * Created by brain on 2/6/17.
 */

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

    boolean consumeBackPress();
}
