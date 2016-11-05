package com.lodz.android.designpatterndemo.designpattern.factorymethod.operation;

/**
 * 计算异常
 * Created by zhouL on 2016/11/5.
 */

public class OperationException extends RuntimeException{

    public OperationException(String message) {
        super(message);
    }
}
