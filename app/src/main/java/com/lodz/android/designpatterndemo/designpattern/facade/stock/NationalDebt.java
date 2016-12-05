package com.lodz.android.designpatterndemo.designpattern.facade.stock;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

/**
 * 国债
 * Created by zhouL on 2016/12/5.
 */
public class NationalDebt {
    public void sell(){
        Log.d(MainActivity.TAG, "国债卖出");
    }

    public void buy(){
        Log.i(MainActivity.TAG, "国债买入");
    }


}
