package com.github.chen.gankapp.base;

import android.app.Application;
import android.util.Log;

import com.github.chen.gankapp.BuildConfig;
import com.github.chen.gankapp.retrofit.RetrofitHelper;
import com.github.chen.gankapp.util.FakeCrashLibrary;

import timber.log.Timber;

/**
 * Created by chen on 2016/9/24.
 */

public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RetrofitHelper.init(this);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new CrashReportingTree());
        }
    }

    /** A tree which logs important information for crash reporting. */
    private static class CrashReportingTree extends Timber.Tree {

        @Override
        protected void log(int priority, String tag, String message, Throwable t) {
            if(priority == Log.VERBOSE || priority == Log.DEBUG){
                return;
            }

            FakeCrashLibrary.log(priority,tag,message);

            if(t != null){
                if(priority == Log.ERROR){
                    FakeCrashLibrary.logError(t);
                }else if(priority == Log.WARN){
                    FakeCrashLibrary.logWarning(t);
                }
            }
        }
    }

}
