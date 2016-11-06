package com.lodz.android.designpatterndemo.designpattern.strategy.contract;

/**
 * 价格策略接口
 * Created by zhouL on 2016/11/6.
 */

public interface IPriceStrategy {
    /** 获取最终价格 */
    float getStrategyResult();
}
