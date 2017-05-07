package com.github.chen.gankapp.activity.main;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.graphics.Palette;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by chen on 2017/2/7.
 */

public class MainPresenter implements MainContract.Presenter{

    private MainContract.View mMainView;

    @NonNull
    private CompositeSubscription mSubsriptions;

    MainPresenter(MainContract.View mainView){
        mMainView = mainView;
        mSubsriptions = new CompositeSubscription();
    }

    @Override
    public void subscribe() {
        getBanner(false);
    }

    @Override
    public void unSubscribe() {

    }

    @Override
    public void getRandomBanner() {

    }

    @Override
    public void setThemeColor(Palette palette) {

    }

    @Override
    public void getBanner(boolean isRandom) {

    }

    @Override
    public void saveImg(Drawable drawable) {

    }
}
