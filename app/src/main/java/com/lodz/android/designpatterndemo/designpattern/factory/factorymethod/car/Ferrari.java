package com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.car;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.contract.ICar;

/**
 * 法拉利
 * Created by zhouL on 2016/11/11.
 */

public class Ferrari implements ICar{
    @Override
    public String name() {
        return "法拉利";
    }

    @Override
    public void drive() {
        Log.d(MainActivity.TAG, "开" + name());
    }
}
