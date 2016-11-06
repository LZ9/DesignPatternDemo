package com.lodz.android.designpatterndemo.designpattern.strategy.impl;

import com.lodz.android.designpatterndemo.designpattern.strategy.contract.IPriceStrategy;

/**
 * 返现策略
 * Created by zhouL on 2016/11/6.
 */
public class ReturnPriceStrategy implements IPriceStrategy {

    /** 总价 */
    private float mPrice;
    /** 返现标准 */
    private float mReturnPriceStandard;
    /** 返现金额 */
    private float mReturnPrice;

    /**
     * 返现策略
     * @param price 总价
     * @param returnPriceStandard 返现标准（例如满100）
     * @param returnPrice 返现金额（例如反50）
     */
    public ReturnPriceStrategy(float price, float returnPriceStandard, float returnPrice) {
        this.mPrice = price;
        this.mReturnPriceStandard = returnPriceStandard;
        this.mReturnPrice = returnPrice;
    }

    @Override
    public float getStrategyResult() {
        if (mPrice > mReturnPriceStandard) {
            return mPrice - ((int)(mPrice / mReturnPriceStandard) * mReturnPrice);
        } else {
            return mPrice;
        }
    }
}
