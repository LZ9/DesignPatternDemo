package com.lodz.android.designpatterndemo.designpattern.proxy.dynamicproxy;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 动态代理
 * Created by zhouL on 2016/11/9.
 */

public class DynamicProxyActivity extends BaseActivity{

    public static final String TAG = "ProxyActivity";

    /** 代理按钮 */
    @BindView(R.id.proxy_button)
    Button mProxyButton;

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, DynamicProxyActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_dynamic_proxy_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mProxyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProxyInvocationHandler handler = new ProxyInvocationHandler(new Work());
                ITask proxy = (ITask) handler.getProxy();
                proxy.doTask();
                proxy.undoTask();
            }
        });
    }

}
