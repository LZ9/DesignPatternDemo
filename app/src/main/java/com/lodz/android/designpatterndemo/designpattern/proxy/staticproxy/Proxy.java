package com.lodz.android.designpatterndemo.designpattern.proxy.staticproxy;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

/**
 * 代理
 * Created by zhouL on 2016/11/9.
 */

public class Proxy implements IAction{

    private IAction mIAction;

    public Proxy(IAction action) {
        this.mIAction = action;
    }

    @Override
    public void doAction() {
        Log.i(MainActivity.TAG, "--- 代理开始 ---");
        mIAction.doAction();
        Log.i(MainActivity.TAG, "--- 代理结束 ---");
    }
}
