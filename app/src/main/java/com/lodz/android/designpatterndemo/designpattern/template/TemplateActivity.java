package com.lodz.android.designpatterndemo.designpattern.template;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.template.test.TestPaper;
import com.lodz.android.designpatterndemo.designpattern.template.test.TestPaperA;
import com.lodz.android.designpatterndemo.designpattern.template.test.TestPaperB;

import butterknife.ButterKnife;

/**
 * 模版方法模式
 * Created by zhouL on 2016/11/30.
 */
public class TemplateActivity extends BaseActivity{

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, TemplateActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_template_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void initData() {
        super.initData();
        Log.w(MainActivity.TAG, "studentA");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestionOne();
        studentA.testQuestionTwo();
        studentA.testQuestionThree();
        Log.e(MainActivity.TAG, " \n ");
        Log.w(MainActivity.TAG, "studentB");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestionOne();
        studentB.testQuestionTwo();
        studentB.testQuestionThree();
    }
}
