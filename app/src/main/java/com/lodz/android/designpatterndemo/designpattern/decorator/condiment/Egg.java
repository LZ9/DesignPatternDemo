package com.lodz.android.designpatterndemo.designpattern.decorator.condiment;

import com.lodz.android.designpatterndemo.designpattern.decorator.Condiment;
import com.lodz.android.designpatterndemo.designpattern.decorator.Humburger;

/**
 * 鸡蛋（装饰者的第三层）
 * Created by zhouL on 2016/11/7.
 */

public class Egg extends Condiment{

    private Humburger mHumburger;

    public Egg(Humburger humburger) {
        this.mHumburger = humburger;
    }

    @Override
    public String getName() {
        return mHumburger.getName() + " 加煎蛋";
    }

    @Override
    public double getPrice() {
        return mHumburger.getPrice() + condimentPrice();
    }

    @Override
    public double condimentPrice() {
        return 2.5;
    }
}
