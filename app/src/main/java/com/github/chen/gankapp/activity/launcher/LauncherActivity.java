package com.github.chen.gankapp.activity.launcher;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chen.gankapp.MainActivity;
import com.github.chen.gankapp.R;

public class LauncherActivity extends AppCompatActivity implements LauncherContract.View {

    private LauncherContract.Presenter mLauncherPresenter = new LauncherPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//竖屏显示
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
}
