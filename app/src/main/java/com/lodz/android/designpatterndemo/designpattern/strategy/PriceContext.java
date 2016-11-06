package com.lodz.android.designpatterndemo.designpattern.strategy;

import com.lodz.android.designpatterndemo.designpattern.strategy.contract.IPriceStrategy;

/**
 * 价格策略调度器
 * Created by zhouL on 2016/11/6.
 */

public class PriceContext {

    private IPriceStrategy mIPriceStrategy;

    public PriceContext(IPriceStrategy iPriceStrategy) {
        this.mIPriceStrategy = iPriceStrategy;
    }

    /** 执行价格策略 */
    public float executePriceStrategy(){
        return mIPriceStrategy.getStrategyResult();
    }
}
