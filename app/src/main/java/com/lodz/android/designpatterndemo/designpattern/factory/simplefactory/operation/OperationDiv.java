package com.lodz.android.designpatterndemo.designpattern.factory.simplefactory.operation;

/**
 * 除法运算
 * Created by zhouL on 2016/11/5.
 */

public class OperationDiv extends Operation {
    @Override
    public float getResult() throws OperationException {
        if (getNumberTwo() == 0f){
            throw new OperationException("除数不能为零");
        }
        return getNumberOne() / getNumberTwo();
    }
}
