package com.github.chen.gankapp.activity.main;

import android.graphics.drawable.Drawable;
import android.support.v7.graphics.Palette;

import com.github.chen.library.base.BasePresenter;
import com.github.chen.library.base.BaseView;

/**
 * Created by chen on 2017/2/7.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

        void showBannerFail(String failMessage, boolean isRandom);

        void setBanner(String imgUrl);

        void startBannerLoadingAnim();

        void stopBannerLoadingAnim();

        void enableFabButton();

        void disEnableFabButton();

        void setAppBarLayoutColor(int appBarLayoutColor);

        void setFabButtonColor(int color);
    }

    interface Presenter extends BasePresenter {

        void getRandomBanner();

        void setThemeColor(Palette palette);

        void getBanner(final boolean isRandom);

        void saveImg(Drawable drawable);

    }

}
