package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.factory;

import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IDatabaseFactory;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IUserDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IVipDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.dao.sqlserver.SqlserverUserDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.dao.sqlserver.SqlserverVipDao;

/**
 * Sqlserver数据库工厂
 * Created by zhouL on 2016/11/13.
 */

public class SqlserverFactory implements IDatabaseFactory{
    @Override
    public IUserDao createUserDao() {
        return new SqlserverUserDao();
    }

    @Override
    public IVipDao createVipDao() {
        return new SqlserverVipDao();
    }
}
