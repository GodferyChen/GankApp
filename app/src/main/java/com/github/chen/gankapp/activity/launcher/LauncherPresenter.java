package com.github.chen.gankapp.activity.launcher;

import android.support.annotation.NonNull;

import com.google.common.base.Preconditions;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by chen on 2017/1/31.
 */

public class LauncherPresenter implements LauncherContract.Presenter{

    private LauncherContract.View mLauncherView;

    @NonNull
    private CompositeSubscription mSubscription;

    public LauncherPresenter(LauncherContract.View launcherView){
        mLauncherView = Preconditions.checkNotNull(launcherView,"mLauncherView cannot be null!");
        mLauncherView.setPresenter(this);
        mSubscription = new CompositeSubscription();
    }

    @Override
    public void subscribe() {
        start();
    }

    @Override
    public void unSubscribe() {
        mSubscription.clear();
    }

    private void start(){
        Observable.just(null)//将传入的参数依次发送出来
                .subscribeOn(Schedulers.io())// 指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread()) // 指定 Subscriber 的回调发生在主线程
                .delaySubscription(2000, TimeUnit.MILLISECONDS)//设置延迟订阅，第二个参数为时间的单位毫秒
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        mLauncherView.toHome();
                    }
                });
    }
}
