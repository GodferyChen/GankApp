package com.github.chen.gankapp.activity.main;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TableLayout;

import com.github.chen.gankapp.R;
import com.github.chen.gankapp.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainContract.View {

    @BindView(R.id.fab_home_random)
    FloatingActionButton mFab;
    @BindView(R.id.appbar)
    AppBarLayout mAppBarLayout;
    @BindView(R.id.iv_home_banner)
    ImageView mIvHomeBanner;
    @BindView(R.id.tl_home_category)
    TabLayout mTlHomeCategory;
    @BindView(R.id.vp_home_category)
    ViewPager mVpCategory;
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout mCollapsingToolbarLayout;
    @BindView(R.id.tl_home_category)
    Toolbar mToolbar;
    @BindView(R.id.iv_home_setting)
    AppCompatImageView mIvSetting;

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
}
