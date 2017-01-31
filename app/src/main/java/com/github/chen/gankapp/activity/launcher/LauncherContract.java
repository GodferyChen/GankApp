package com.github.chen.gankapp.activity.launcher;

import com.github.chen.library.base.BasePresenter;
import com.github.chen.library.base.BaseView;

/**
 * Created by chen on 2017/1/31.
 */

public interface LauncherContract {

    interface View extends BaseView{
        void toHome();
    }

    interface Presenter extends BasePresenter{

    }

}
