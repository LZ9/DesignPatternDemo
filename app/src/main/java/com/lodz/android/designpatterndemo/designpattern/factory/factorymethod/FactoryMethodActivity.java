package com.lodz.android.designpatterndemo.designpattern.factory.factorymethod;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.contract.ICar;
import com.lodz.android.designpatterndemo.designpattern.factory.factorymethod.contract.ICarFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 工厂方法
 * Created by zhouL on 2016/11/10.
 */

public class FactoryMethodActivity extends BaseActivity{

    /** 奥迪 */
    @BindView(R.id.audi_button)
    Button mAudiButton;
    /** 法拉利 */
    @BindView(R.id.ferrari_button)
    Button mFerrariButton;

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, FactoryMethodActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_factory_method_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mAudiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAudi();
            }
        });

        mFerrariButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createFerrari();
            }
        });
    }

    private void createAudi() {
        ICarFactory factory = new AudiFactory();
        ICar car = factory.createCar();
        car.drive();
    }

    private void createFerrari() {
        ICarFactory factory = new FerrariFactory();
        ICar car = factory.createCar();
        car.drive();
    }

}
