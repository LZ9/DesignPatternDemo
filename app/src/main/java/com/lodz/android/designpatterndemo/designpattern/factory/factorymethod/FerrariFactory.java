package com.lodz.android.designpatterndemo.designpattern.factory.factorymethod;

import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.car.Ferrari;
import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.contract.ICar;
import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.contract.ICarFactory;

/**
 * 法拉利工厂
 * Created by zhouL on 2016/11/11.
 */

public class FerrariFactory implements ICarFactory{
    @Override
    public ICar createCar() {
        return new Ferrari();
    }
}
