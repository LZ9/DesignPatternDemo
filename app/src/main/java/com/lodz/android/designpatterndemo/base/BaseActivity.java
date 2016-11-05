package com.lodz.android.designpatterndemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 基类Activity
 * Created by zhouL on 2016/11/5.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startCreate();
        setContentView(getLayoutId());
        findViews();
        setListeners();
        initData();
        endCreate();
    }

    protected void startCreate() {}

    protected abstract int getLayoutId();

    protected abstract void findViews();

    protected void setListeners(){}

    protected void initData() {}

    protected void endCreate() {}
}
