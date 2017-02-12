package com.lodz.android.designpatterndemo.designpattern.builder.product;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品
 * Created by zhouL on 2017/2/12.
 */
public class Product {

    private List<String> mParts = new ArrayList<>();

    public void add(String part){
        mParts.add(part);
    }

    public void show(){
        Log.d(MainActivity.TAG, "构造产品：");
        for (String part : mParts) {
            Log.i(MainActivity.TAG, part);
        }
    }


}
