package com.lodz.android.designpatterndemo.designpattern.facade.stock;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

/**
 * 房地产
 * Created by zhouL on 2016/12/5.
 */
public class Realty {
    public void sell(){
        Log.d(MainActivity.TAG, "房地产卖出");
    }

    public void buy(){
        Log.i(MainActivity.TAG, "房地产买入");
    }
}
