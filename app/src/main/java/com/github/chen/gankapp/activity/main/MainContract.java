package com.github.chen.gankapp.activity.main;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;

import com.github.chen.library.base.BasePresenter;
import com.github.chen.library.base.BaseView;

/**
 * Created by chen on 2017/2/7.
 */

public interface MainContract {

    interface View extends BaseView{

    }

    interface Presenter extends BasePresenter{

        void getRandomBanner();

//        void setThemeColor(Palette palette);

        void getBanner(final boolean isRandom);

        void saveImg(Drawable drawable);

    }

}
