package com.lodz.android.designpatterndemo.designpattern.decorator.condiment;

import com.lodz.android.designpatterndemo.designpattern.decorator.Condiment;
import com.lodz.android.designpatterndemo.designpattern.decorator.Humburger;

/**
 * 辣椒（装饰者的第二层）
 * Created by zhouL on 2016/11/7.
 */

public class Chilli extends Condiment {

    private Humburger mHumburger;

    public Chilli(Humburger humburger) {
        this.mHumburger = humburger;
    }

    @Override
    public String getName() {
        return mHumburger.getName() + " 加辣椒";
    }

    @Override
    public double getPrice() {
        return mHumburger.getPrice() + condimentPrice();
    }

    @Override
    public double condimentPrice() {
        return 0;// 加辣椒免费
    }
}
