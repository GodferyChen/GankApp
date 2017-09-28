package com.github.chen.gankapp.activity.main;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import com.github.chen.gankapp.R;
import com.github.chen.gankapp.base.BaseActivity;
import com.google.common.base.Preconditions;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainContract.Presenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        new MainPresenter(this);
        // TODO: 2017/9/28 目前还没想清楚要做什么功能 先立flag
    }

    @Override
    public void showBannerFail(String failMessage, boolean isRandom) {

    }

    @Override
    public void setBanner(String imgUrl) {

    }

    @Override
    public void startBannerLoadingAnim() {

    }

    @Override
    public void stopBannerLoadingAnim() {

    }

    @Override
    public void enableFabButton() {

    }

    @Override
    public void disEnableFabButton() {

    }

    @Override
    public void setAppBarLayoutColor(int appBarLayoutColor) {

    }

    @Override
    public void setFabButtonColor(int color) {

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mMainPresenter = Preconditions.checkNotNull(presenter);
    }

    public void onClick(View view) {

    }
}
