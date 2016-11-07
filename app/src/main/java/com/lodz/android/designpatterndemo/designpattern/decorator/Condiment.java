package com.lodz.android.designpatterndemo.designpattern.decorator;

/**
 * 配料的基类（装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料）
 * Created by zhouL on 2016/11/7.
 */

public abstract class Condiment extends Humburger {
    /** 配料单价 */
    public abstract double condimentPrice();
}
