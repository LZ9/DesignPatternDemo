package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.dao.sqlserver;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IVipDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.VipTable;

/**
 * 在Sqlserver中实现VIP表接口
 * Created by zhouL on 2016/11/13.
 */
public class SqlserverVipDao implements IVipDao {
    @Override
    public void update(VipTable vipTable) {
        Log.d(MainActivity.TAG, "在Sqlserver中更新VIP表中vip等级为 " + vipTable.getVipLevel() + " 的信息");
    }

    @Override
    public void delete(VipTable vipTable) {
        Log.d(MainActivity.TAG, "在Sqlserver中删除VIP表中vip等级为 " + vipTable.getVipLevel() + " 的信息");
    }
}
