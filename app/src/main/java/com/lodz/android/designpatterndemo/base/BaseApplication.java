package com.lodz.android.designpatterndemo.base;

import android.app.Application;

/**
 * Application基类
 * Created by zhouL on 2016/11/13.
 */


public class BaseApplication extends Application{

    private static BaseApplication sApplication;

    public static Application getApplication(){
        return sApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
    }
}
