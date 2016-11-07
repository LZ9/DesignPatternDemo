package com.lodz.android.designpatterndemo.designpattern.decorator.condiment;

import com.lodz.android.designpatterndemo.designpattern.decorator.Condiment;
import com.lodz.android.designpatterndemo.designpattern.decorator.Humburger;

/**
 * 生菜（装饰者的第一层）
 * Created by zhouL on 2016/11/7.
 */

public class Lettuce extends Condiment {

    private Humburger mHumburger;

    public Lettuce(Humburger humburger) {
        this.mHumburger = humburger;
    }

    @Override
    public String getName() {
        return mHumburger.getName() + " 加生菜";
    }

    @Override
    public double getPrice() {
        return mHumburger.getPrice() + condimentPrice();
    }

    @Override
    public double condimentPrice() {
        return 1.5;
    }
}
