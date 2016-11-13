package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract;

import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.VipTable;

/**
 * VIP表接口
 * Created by zhouL on 2016/11/13.
 */
public interface IVipDao {

    /**
     * 更新VIP表信息
     * @param vipTable VIP表
     */
    void update(VipTable vipTable);

    /**
     * 删除VIP表信息
     * @param vipTable VIP表
     */
    void delete(VipTable vipTable);
}
