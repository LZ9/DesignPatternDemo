package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.dao.sqlserver;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IUserDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.UserTable;

/**
 * 在Sqlserver中实现用户表接口
 * Created by zhouL on 2016/11/13.
 */
public class SqlserverUserDao implements IUserDao {
    @Override
    public void insert(UserTable userTable) {
        Log.d(MainActivity.TAG, "在Sqlserver中给User表增加一条id为 " + userTable.getId() + " 记录");
    }

    @Override
    public UserTable queryUser(int id) {
        Log.d(MainActivity.TAG, "在Sqlserver中查询User表里id为 " + id + " 的记录");
        return null;
    }
}
