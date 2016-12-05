package com.lodz.android.designpatterndemo.designpattern.facade;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 外观模式
 * Created by zhouL on 2016/12/5.
 */
public class FacadeActivity extends BaseActivity{


    /** 操作 */
    @BindView(R.id.handle_button)
    Button mHandleButton;

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, FacadeActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_facade_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mHandleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handle();
            }
        });
    }

    private void handle() {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }


}
