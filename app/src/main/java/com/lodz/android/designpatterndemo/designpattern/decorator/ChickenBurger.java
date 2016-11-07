package com.lodz.android.designpatterndemo.designpattern.decorator;

/**
 * 鸡腿堡（对汉堡有一些基础的装饰）
 * Created by zhouL on 2016/11/7.
 */

public class ChickenBurger extends Humburger {

    @Override
    public String getName() {
        return "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
