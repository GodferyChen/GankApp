package com.github.chen.gankapp.activity.main;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import com.github.chen.gankapp.R;
import com.github.chen.gankapp.activity.TestActivity;
import com.github.chen.gankapp.base.BaseActivity;
import com.google.common.base.Preconditions;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainContract.Presenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        new MainPresenter(this);
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
        if (view.getId() == R.id.button) {
            startActivity(new Intent(MainActivity.this, TestActivity.class));
        }
    }
}
