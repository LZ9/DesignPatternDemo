package com.lodz.android.designpatterndemo.designpattern.decorator;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.decorator.condiment.Chilli;
import com.lodz.android.designpatterndemo.designpattern.decorator.condiment.Egg;
import com.lodz.android.designpatterndemo.designpattern.decorator.condiment.Lettuce;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 装饰者模式
 * Created by zhouL on 2016/11/7.
 */

public class DecoratorActivity extends BaseActivity {

    /** 鸡腿堡 */
    @BindView(R.id.chicken_burger)
    Button mChickenBurger;

    /** 鸡腿堡 + 生菜 */
    @BindView(R.id.chicken_burger_with_lettuce)
    Button mChickenBurgerWithLettuce;

    /** 鸡腿堡 + 辣椒 */
    @BindView(R.id.chicken_burger_with_chilli)
    Button mChickenBurgerWithChilli;

    /** 鸡腿堡 + 煎蛋 */
    @BindView(R.id.chicken_burger_with_egg)
    Button mChickenBurgerWithEgg;

    /** 鸡腿堡 + 生菜 + 煎蛋 */
    @BindView(R.id.chicken_burger_with_lettuce_and_egg)
    Button mChickenBurgerWithLettuceAndEgg;

    /** 鸡腿堡 + 生菜 + 煎蛋 + 辣椒 */
    @BindView(R.id.chicken_burger_with_lettuce_and_egg_chilli)
    Button mChickenBurgerWithLettuceAndEggChilli;

    /** 结果 */
    @BindView(R.id.result)
    TextView mResult;

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, DecoratorActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_decorator_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mChickenBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChickenBurger();
            }
        });

        mChickenBurgerWithLettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChickenBurgerWithLettuce();
            }
        });

        mChickenBurgerWithChilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChickenBurgerWithChilli();
            }
        });

        mChickenBurgerWithEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChickenBurgerWithEgg();
            }
        });

        mChickenBurgerWithLettuceAndEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChickenBurgerWithLettuceAndEgg();
            }
        });

        mChickenBurgerWithLettuceAndEggChilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChickenBurgerWithLettuceAndEggChilli();
            }
        });
    }

    private void getChickenBurger() {
        Humburger humburger = new ChickenBurger();
        mResult.setText(humburger.getName()+"  价钱："+humburger.getPrice());
    }

    private void getChickenBurgerWithLettuce() {
        Humburger humburger = new ChickenBurger();
        Lettuce lettuce = new Lettuce(humburger);
        mResult.setText(lettuce.getName()+"  价钱："+lettuce.getPrice());
    }

    private void getChickenBurgerWithChilli() {
        Humburger humburger = new ChickenBurger();
        Chilli chilli = new Chilli(humburger);
        mResult.setText(chilli.getName()+"  价钱："+chilli.getPrice());
    }

    private void getChickenBurgerWithEgg() {
        Humburger humburger = new ChickenBurger();
        Egg egg = new Egg(humburger);
        mResult.setText(egg.getName()+"  价钱："+egg.getPrice());
    }

    private void getChickenBurgerWithLettuceAndEgg() {
        Humburger humburger = new ChickenBurger();
        Lettuce lettuce = new Lettuce(humburger);
        Egg egg = new Egg(lettuce);
        mResult.setText(egg.getName()+"  价钱："+egg.getPrice());
    }

    private void getChickenBurgerWithLettuceAndEggChilli() {
        Humburger humburger = new ChickenBurger();
        Lettuce lettuce = new Lettuce(humburger);
        Egg egg = new Egg(lettuce);
        Chilli chilli = new Chilli(egg);
        mResult.setText(chilli.getName()+"  价钱："+chilli.getPrice());
    }
}
