package com.lodz.android.designpatterndemo.designpattern.factory.simplefactory.operation;

/**
 * 计算操作的抽象类
 * Created by zhouL on 2016/11/5.
 */
public abstract class Operation {

    /** 数字1 */
    private float numberOne;
    /** 数字2 */
    private float numberTwo;

    public float getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(float numberOne) {
        this.numberOne = numberOne;
    }

    public float getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(float numberTwo) {
        this.numberTwo = numberTwo;
    }

    /** 获取计算结果 */
    public abstract float getResult();
}