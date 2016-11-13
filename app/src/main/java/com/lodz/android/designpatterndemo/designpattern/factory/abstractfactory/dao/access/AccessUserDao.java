package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.dao.access;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IUserDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.UserTable;

/**
 * 在Access中实现用户表接口
 * Created by zhouL on 2016/11/13.
 */
public class AccessUserDao implements IUserDao {
    @Override
    public void insert(UserTable userTable) {
        Log.i(MainActivity.TAG, "在Access中给User表增加一条id为 " + userTable.getId() + " 记录");
    }

    @Override
    public UserTable queryUser(int id) {
        Log.i(MainActivity.TAG, "在Access中查询User表里id为 " + id + " 的记录");
        return null;
    }
}
