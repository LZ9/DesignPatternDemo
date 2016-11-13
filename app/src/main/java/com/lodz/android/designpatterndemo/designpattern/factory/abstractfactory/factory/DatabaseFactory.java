package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.factory;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.base.BaseApplication;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.ReflectUtils;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IDatabaseFactory;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IUserDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IVipDao;

/**
 * 数据库工厂
 * Created by zhouL on 2016/11/13.
 */
public class DatabaseFactory implements IDatabaseFactory{

    @Override
    public IUserDao createUserDao() {
        String databaseName = getDatabaseName(BaseApplication.getApplication());
        Object object = getDaoObject(databaseName, "UserDao");
        return (IUserDao) object;
    }

    @Override
    public IVipDao createVipDao() {
        String databaseName = getDatabaseName(BaseApplication.getApplication());
        Object object = getDaoObject(databaseName, "VipDao");
        return (IVipDao) object;
    }

    /**
     * 获取表单操作对象
     * @param databaseName 数据库名称
     * @param daoName 表单操作名称
     */
    private Object getDaoObject(String databaseName, String daoName){
        Object daoObject = null;
        try {
            Class c = ReflectUtils.getClassForName("com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.factory." + databaseName + "Factory");
            Object object = ReflectUtils.getObject(c);
            daoObject = ReflectUtils.executeFunction(c, object, "create" + daoName);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(MainActivity.TAG, "获取数据库工厂对象失败");
        }
        if (daoObject == null){
            Log.e(MainActivity.TAG, "获取数据库操作对象失败");
        }
        return daoObject;
    }

    /**
     * 获取数据库名称
     * @param context 上下文
     */
    private String getDatabaseName(Context context){
        ApplicationInfo appInfo = null;
        try {
            appInfo = context.getPackageManager()
                    .getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (appInfo == null){
            return null;
        }
        String databaseName = appInfo.metaData.getString("database_name");
        if (TextUtils.isEmpty(databaseName)){
            Log.e(MainActivity.TAG, "获取数据库配置信息失败");
        }
        return databaseName;
    }

}
