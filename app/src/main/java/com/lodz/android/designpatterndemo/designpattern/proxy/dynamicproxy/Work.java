package com.lodz.android.designpatterndemo.designpattern.proxy.dynamicproxy;

import android.util.Log;

/**
 * 工作
 * Created by zhouL on 2016/11/9.
 */

public class Work implements ITask{
    @Override
    public void doTask() {
        Log.d(DynamicProxyActivity.TAG, "完成工作");
    }

    @Override
    public void undoTask() {
        Log.d(DynamicProxyActivity.TAG, "取消工作");
    }
}
