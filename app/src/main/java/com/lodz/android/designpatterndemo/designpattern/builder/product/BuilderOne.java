package com.lodz.android.designpatterndemo.designpattern.builder.product;

/**
 * 产品1的构造实现类
 * Created by zhouL on 2017/2/12.
 */
public class BuilderOne extends Builder{

    private Product mProduct = new Product();

    @Override
    public void builderPartA() {
        mProduct.add("产品1的A部件");
    }

    @Override
    public void builderPartB() {
        mProduct.add("产品1的B部件");
    }

    @Override
    public Product getResult() {
        return mProduct;
    }
}
