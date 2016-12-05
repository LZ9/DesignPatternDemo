package com.lodz.android.designpatterndemo.designpattern.facade.stock;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

/**
 * 股票C
 * Created by zhouL on 2016/12/5.
 */
public class StockC {

    public void sell(){
        Log.d(MainActivity.TAG, "股票C卖出");
    }

    public void buy(){
        Log.i(MainActivity.TAG, "股票C买入");
    }

}
