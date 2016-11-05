package com.lodz.android.designpatterndemo.designpattern.factorymethod.operation;

/**
 * 减法运算
 * Created by zhouL on 2016/11/5.
 */

public class OperationSub extends Operation {
    @Override
    public float getResult() {
        return getNumberOne() - getNumberTwo();
    }
}
