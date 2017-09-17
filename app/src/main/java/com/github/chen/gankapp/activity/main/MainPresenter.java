package com.github.chen.gankapp.activity.main;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.graphics.Palette;

import com.github.chen.gankapp.R;
import com.github.chen.gankapp.base.AppContext;
import com.github.chen.gankapp.util.ThemeManager;
import com.google.common.base.Preconditions;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by chen on 2017/2/7.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mMainView;

    @NonNull
    private CompositeSubscription mSubscriptions;

    public MainPresenter(MainContract.View mainView) {
        mMainView = Preconditions.checkNotNull(mainView, "mainView cannot be null!");
        mMainView.setPresenter(this);
        mSubscriptions = new CompositeSubscription();
    }

    @Override
    public void subscribe() {
        getBanner(false);
        cacheRandomImg();
    }

    @Override
    public void unSubscribe() {
        mSubscriptions.clear();
    }

    @Override
    public void getRandomBanner() {
        getBanner(true);
    }

    @Override
    public void setThemeColor(Palette palette) {
        if (palette != null) {
            int colorPrimary = AppContext.getInstance().getResources().getColor(R.color
                    .colorPrimary);
            //把从调色板上获取的主题色保存到内存中
            ThemeManager.INSTANCE.setColorPrimary(palette.getDarkVibrantColor(colorPrimary));
            //设置 AppBarLayout 的背景色
            mMainView.setAppBarLayoutColor(ThemeManager.INSTANCE.getColorPrimary());
            //设置 FabButton 的背景色
            mMainView.setFabButtonColor(ThemeManager.INSTANCE.getColorPrimary());
            //停止 FabButton 加载中动画
            mMainView.enableFabButton();
            mMainView.stopBannerLoadingAnim();
        }
    }

    @Override
    public void getBanner(boolean isRandom) {

    }

    @Override
    public void saveImg(Drawable drawable) {

    }

    public void cacheRandomImg() {

    }
}
