package com.lodz.android.designpatterndemo.designpattern.factory.factorymethod;

import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.car.Audi;
import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.contract.ICar;
import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.contract.ICarFactory;

/**
 * 奥迪工厂
 * Created by zhouL on 2016/11/11.
 */

public class AudiFactory implements ICarFactory{
    @Override
    public ICar createCar() {
        return new Audi();
    }
}
