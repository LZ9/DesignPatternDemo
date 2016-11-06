package com.lodz.android.designpatterndemo.designpattern.strategy;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.strategy.impl.DiscountPriceStrategy;
import com.lodz.android.designpatterndemo.designpattern.strategy.impl.NormalPriceStrategy;
import com.lodz.android.designpatterndemo.designpattern.strategy.impl.ReturnPriceStrategy;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 策略模式
 * Created by zhouL on 2016/11/5.
 */

public class StrategyActivity extends BaseActivity {

    /** 正常价格 */
    @BindView(R.id.normal_price_button)
    Button mNormalPriceButton;

    /** 折扣价格 */
    @BindView(R.id.discount_price_button)
    Button mDiscountPriceButton;

    /** 返现价格 */
    @BindView(R.id.return_price_button)
    Button mReturnPriceButton;

    /** 价格显示 */
    @BindView(R.id.result)
    TextView mResultTextView;

    /** 价格 */
    private float mPrice = 211.3f;

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
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();

        mNormalPriceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                normalPrice();
            }
        });

        mDiscountPriceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                discountPrice();
            }
        });

        mReturnPriceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnPrice();
            }
        });
    }

    private void normalPrice() {
        PriceContext priceContext = new PriceContext(new NormalPriceStrategy(mPrice));
        mResultTextView.setText(getString(R.string.price_result, mPrice+"", priceContext.executePriceStrategy()+""));
    }

    private void discountPrice() {
        PriceContext priceContext = new PriceContext(new DiscountPriceStrategy(mPrice, 0.7f));
        mResultTextView.setText(getString(R.string.price_result, mPrice+"", priceContext.executePriceStrategy()+""));
    }

    private void returnPrice() {
        PriceContext priceContext = new PriceContext(new ReturnPriceStrategy(mPrice, 100f, 30f));
        mResultTextView.setText(getString(R.string.price_result, mPrice+"", priceContext.executePriceStrategy()+""));
    }
}
