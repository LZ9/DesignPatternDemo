package com.lodz.android.designpatterndemo.designpattern.builder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.builder.product.Builder;
import com.lodz.android.designpatterndemo.designpattern.builder.product.BuilderOne;
import com.lodz.android.designpatterndemo.designpattern.builder.product.BuilderTwo;
import com.lodz.android.designpatterndemo.designpattern.builder.product.Director;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 建造者模式
 * Created by zhouL on 2017/2/8.
 */
public class BuilderActivity extends BaseActivity{

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, BuilderActivity.class);
        context.startActivity(intent);
    }

    /** 动态代理模式 */
    @BindView(R.id.create_product)
    Button mCreateProductButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_builder_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mCreateProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Director director = new Director();// 构造器

                Builder builderOne = new BuilderOne();
                Builder builderTwo = new BuilderTwo();

                director.construct(builderOne);// 构造产品1
                builderOne.getResult().show();// 获取构造结果

                director.construct(builderTwo);// 构造产品2
                builderTwo.getResult().show();// 获取构造结果

            }
        });
    }
}
