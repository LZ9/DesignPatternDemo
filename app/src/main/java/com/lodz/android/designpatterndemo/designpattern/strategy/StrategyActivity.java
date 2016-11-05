package com.lodz.android.designpatterndemo.designpattern.strategy;

import android.content.Context;
import android.content.Intent;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;

/**
 * Created by zhouL on 2016/11/5.
 */

public class StrategyActivity extends BaseActivity {

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, StrategyActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_strategy_layout;
    }

    @Override
    protected void findViews() {

    }
}
