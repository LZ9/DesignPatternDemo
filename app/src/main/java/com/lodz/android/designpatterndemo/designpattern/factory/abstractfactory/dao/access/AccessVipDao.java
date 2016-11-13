package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.dao.access;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IVipDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.VipTable;

/**
 * 在Access中实现VIP表接口
 * Created by zhouL on 2016/11/13.
 */
public class AccessVipDao implements IVipDao {
    @Override
    public void update(VipTable vipTable) {
        Log.i(MainActivity.TAG, "在Access中更新VIP表中vip等级为 " + vipTable.getVipLevel() + " 的信息");
    }

    @Override
    public void delete(VipTable vipTable) {
        Log.i(MainActivity.TAG, "在Access中删除VIP表中vip等级为 " + vipTable.getVipLevel() + " 的信息");
    }
}
