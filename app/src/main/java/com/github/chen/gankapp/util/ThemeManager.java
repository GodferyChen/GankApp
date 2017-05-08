package com.github.chen.gankapp.util;

/**
 * Created by chen on 2017/5/8.
 */

public enum ThemeManager {

    INSTANCE;

    private int colorPrimary;

    public void initColorPrimary(int colorPrimary){
        setColorPrimary(colorPrimary);
    }

    public int getColorPrimary() {
        return colorPrimary;
    }

    public void setColorPrimary(int colorPrimary) {
        this.colorPrimary = colorPrimary;
    }
}
