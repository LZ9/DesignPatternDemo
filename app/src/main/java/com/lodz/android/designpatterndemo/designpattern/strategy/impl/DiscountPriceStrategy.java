package com.lodz.android.designpatterndemo.designpattern.strategy.impl;

import com.lodz.android.designpatterndemo.designpattern.strategy.contract.IPriceStrategy;

/**
 * 打折策略
 * Created by zhouL on 2016/11/6.
 */
public class DiscountPriceStrategy implements IPriceStrategy{

    /** 价格 */
    private float mPrice;
    /** 折扣率 */
    private float mDiscount;

    /**
     * 打折策略
     * @param price 总价
     * @param discount 折扣率(0.0-1.0)
     */
    public DiscountPriceStrategy(float price, float discount) {
        this.mPrice = price;
        if (discount < 0f || discount > 1f){
            discount = 1f;
        }
        this.mDiscount = discount;
    }

    @Override
    public float getStrategyResult() {
        return mPrice * mDiscount;
    }
}
