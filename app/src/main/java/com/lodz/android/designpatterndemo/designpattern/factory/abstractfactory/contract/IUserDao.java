package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract;

import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.UserTable;

/**
 * 用户表接口
 * Created by zhouL on 2016/11/13.
 */
public interface IUserDao {

    /**
     * 在用户表增加一条信息
     * @param userTable 用户表
     */
    void insert(UserTable userTable);

    /**
     * 根据id查询用户表信息
     * @param id 用户id
     */
    UserTable queryUser(int id);
}
