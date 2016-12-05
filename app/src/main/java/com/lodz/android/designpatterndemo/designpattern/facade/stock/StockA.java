package com.lodz.android.designpatterndemo.designpattern.facade.stock;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

/**
 * 股票A
 * Created by zhouL on 2016/12/5.
 */
public class StockA {

    public void sell(){
        Log.d(MainActivity.TAG, "股票A卖出");
    }

    public void buy(){
        Log.i(MainActivity.TAG, "股票A买入");
    }

}
