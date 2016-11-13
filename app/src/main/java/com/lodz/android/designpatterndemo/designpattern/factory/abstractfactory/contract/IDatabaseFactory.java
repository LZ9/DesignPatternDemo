package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract;

/**
 * 数据库工厂接口
 * Created by zhouL on 2016/11/13.
 */
public interface IDatabaseFactory {
    /** 创建用户表操作类 */
    IUserDao createUserDao();
    /** 创建VIP表操作类 */
    IVipDao createVipDao();
}
