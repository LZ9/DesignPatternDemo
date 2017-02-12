package com.lodz.android.designpatterndemo.designpattern.builder.product;

/**
 * 构造控制器
 * Created by zhouL on 2017/2/12.
 */
public class Director {

    /**
     * 构造产品
     * @param builder 构造者
     */
    public void construct(Builder builder){
        builder.builderPartA();
        builder.builderPartB();
    }
}
