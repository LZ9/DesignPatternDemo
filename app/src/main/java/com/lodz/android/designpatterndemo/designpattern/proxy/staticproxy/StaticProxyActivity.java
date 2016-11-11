package com.lodz.android.designpatterndemo.designpattern.proxy.staticproxy;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 静态代理
 * Created by zhouL on 2016/11/9.
 */

public class StaticProxyActivity extends BaseActivity{

    /** 买彩票 */
    @BindView(R.id.action_button)
    Button mActionButton;

    /** 代理买彩票 */
    @BindView(R.id.proxy_action_button)
    Button mProxyActionButton;

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, StaticProxyActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_static_proxy_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IAction action = new BuyLotto();
                action.doAction();
            }
        });

        mProxyActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Proxy proxy = new Proxy(new BuyLotto());
                proxy.doAction();
            }
        });
    }
}
