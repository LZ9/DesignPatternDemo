package com.lodz.android.designpatterndemo;

import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.factorymethod.FactoryMethodPatternActivity;
import com.lodz.android.designpatterndemo.designpattern.strategy.StrategyActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    /** 简单工厂模式 */
    @BindView(R.id.factory_method_pattern_button)
    Button mFactoryMethodPatternButton;

    /** 策略模式 */
    @BindView(R.id.strategy_pattern_button)
    Button mStrategyPatternButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mFactoryMethodPatternButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FactoryMethodPatternActivity.start(MainActivity.this);
            }
        });

        mStrategyPatternButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrategyActivity.start(MainActivity.this);
            }
        });

    }
}
