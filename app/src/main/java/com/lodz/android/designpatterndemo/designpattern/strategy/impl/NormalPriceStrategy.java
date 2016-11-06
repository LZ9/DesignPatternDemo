package com.lodz.android.designpatterndemo.designpattern.strategy.impl;

import com.lodz.android.designpatterndemo.designpattern.strategy.contract.IPriceStrategy;

/**
 * 正常价格
 * Created by zhouL on 2016/11/6.
 */
public class NormalPriceStrategy implements IPriceStrategy {

    /** 价格 */
    private float mPrice;

    public NormalPriceStrategy(float totalPrice){
        this.mPrice = totalPrice;
    }

    @Override
    public float getStrategyResult() {
        return mPrice;
    }
}
