package com.lodz.android.designpatterndemo.designpattern.facade.stock;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

/**
 * 股票B
 * Created by zhouL on 2016/12/5.
 */
public class StockB {

    public void sell(){
        Log.d(MainActivity.TAG, "股票B卖出");
    }

    public void buy(){
        Log.i(MainActivity.TAG, "股票B买入");
    }


}
