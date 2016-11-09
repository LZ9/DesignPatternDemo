package com.lodz.android.designpatterndemo.designpattern.proxy.staticproxy;

import android.util.Log;

/**
 * 买彩票
 * Created by zhouL on 2016/11/9.
 */

public class BuyLotto implements IAction{
    @Override
    public void doAction() {
        Log.d(StaticProxyActivity.TAG, "买彩票");
    }
}
