package com.lodz.android.designpatterndemo.designpattern.decorator;

/**
 * 汉堡（被装饰者）
 * Created by zhouL on 2016/11/7.
 */

public abstract class Humburger {

    /** 汉堡的名字 */
    public abstract String getName();
    /** 汉堡的价格 */
    public abstract double getPrice();
}
