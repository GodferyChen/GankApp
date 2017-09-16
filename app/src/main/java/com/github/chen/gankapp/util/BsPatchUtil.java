package com.github.chen.gankapp.util;

/**
 * Created by chen on 2017/6/8.
 */

public class BsPatchUtil {

    static {
        System.loadLibrary("apkpatch");
    }

    public static native int patches(String oldApkPath, String newApkPath, String patchPath);

}
