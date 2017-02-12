package com.lodz.android.designpatterndemo.designpattern.builder.product;

/**
 * 构造者抽象类
 * Created by zhouL on 2017/2/12.
 */
public abstract class Builder {

    /** 构造部件A */
    public abstract void builderPartA();
    /** 构造部件B */
    public abstract void builderPartB();
    /** 获取构造结果 */
    public abstract Product getResult();

}
