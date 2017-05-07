package com.github.chen.gankapp.activity.main;

import android.os.Bundle;

import com.github.chen.gankapp.R;
import com.github.chen.gankapp.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainContract.Presenter mMainPresenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void setPresenter(Object presenter) {

    }
}
