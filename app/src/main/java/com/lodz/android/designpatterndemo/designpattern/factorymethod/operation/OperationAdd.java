package com.lodz.android.designpatterndemo.designpattern.factorymethod.operation;

/**
 * 加法运算
 * Created by zhouL on 2016/11/5.
 */
public class OperationAdd extends Operation {
    @Override
    public float getResult() {
        return getNumberOne() + getNumberTwo();
    }
}
