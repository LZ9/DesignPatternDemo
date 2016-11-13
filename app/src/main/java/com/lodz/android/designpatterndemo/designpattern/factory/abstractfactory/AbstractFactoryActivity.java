package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IDatabaseFactory;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IUserDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.contract.IVipDao;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.factory.DatabaseFactory;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.UserTable;
import com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory.table.VipTable;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 抽象工厂
 * Created by zhouL on 2016/11/13.
 */

public class AbstractFactoryActivity extends BaseActivity{

    /** 向用户表插入一条记录 */
    @BindView(R.id.insert_button)
    Button mInsertButton;
    /** 查询用户表记录 */
    @BindView(R.id.query_button)
    Button mQueryButton;
    /** 查询用户表记录 */
    @BindView(R.id.update_button)
    Button mUpdateButton;
    /** 查询用户表记录 */
    @BindView(R.id.delete_button)
    Button mDeleteButton;

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, AbstractFactoryActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_abstract_factory_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mInsertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IDatabaseFactory factory = new DatabaseFactory();
                IUserDao userDao = factory.createUserDao();
                UserTable user = new UserTable();
                user.setId(7);
                if (userDao != null){
                    userDao.insert(user);
                }
            }
        });

        mQueryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IDatabaseFactory factory = new DatabaseFactory();
                IUserDao userDao = factory.createUserDao();
                if (userDao != null){
                    userDao.queryUser(7);
                }
            }
        });

        mUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IDatabaseFactory factory = new DatabaseFactory();
                IVipDao vipDao = factory.createVipDao();
                VipTable vipTable = new VipTable();
                vipTable.setVipLevel(2);
                if (vipDao != null){
                    vipDao.update(vipTable);
                }
            }
        });

        mDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IDatabaseFactory factory = new DatabaseFactory();
                IVipDao vipDao = factory.createVipDao();
                VipTable vipTable = new VipTable();
                vipTable.setVipLevel(2);
                if (vipDao != null){
                    vipDao.delete(vipTable);
                }
            }
        });
    }

}
