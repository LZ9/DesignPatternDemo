package com.lodz.android.designpatterndemo.designpattern.factorymethod;

import android.content.Context;
import android.content.Intent;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;

/**
 * 简单工厂模式
 * Created by zhouL on 2016/11/5.
 */

public class FactoryMethodPatternActivity extends BaseActivity {

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, FactoryMethodPatternActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_factory_method_pattern_layout;
    }

    @Override
    protected void findViews() {

    }
}
