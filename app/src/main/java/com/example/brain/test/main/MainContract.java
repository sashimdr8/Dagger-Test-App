package com.example.brain.test.main;

import com.example.brain.test.BasePresenter;
import com.example.brain.test.BaseView;

/**
 * Created by brain on 2/6/17.
 */

public interface MainContract {
    interface Presenter extends BasePresenter{

    }

    interface View extends BaseView<Presenter> {

    }

}
