package com.github.chen.gankapp.activity.launcher;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.github.chen.gankapp.activity.main.MainActivity;
import com.github.chen.gankapp.base.BaseActivity;

import timber.log.Timber;

import static com.google.common.base.Preconditions.checkNotNull;

public class LauncherActivity extends BaseActivity implements LauncherContract.View {

    private LauncherContract.Presenter mLauncherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//竖屏显示

        new LauncherPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mLauncherPresenter.subscribe();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mLauncherPresenter.unSubscribe();
    }

    @Override
    public void toHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //处理按下返回键的操作
    }


    @Override
    public void setPresenter(@NonNull LauncherContract.Presenter presenter) {
        mLauncherPresenter = checkNotNull(presenter);
    }
}
