package com.lodz.android.designpatterndemo.designpattern.template.test;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;

/**
 * 试卷
 * Created by zhouL on 2016/11/30.
 */
public abstract class TestPaper {

    public void testQuestionOne(){
        Log.d(MainActivity.TAG, "question one");
        Log.i(MainActivity.TAG, "answer is " + answer1());
    }

    public void testQuestionTwo(){
        Log.d(MainActivity.TAG, "question Two");
        Log.i(MainActivity.TAG, "answer is " + answer2());
    }

    public void testQuestionThree(){
        Log.d(MainActivity.TAG, "question Three");
        Log.i(MainActivity.TAG, "answer is " + answer3());
    }

    protected abstract String answer1();

    protected abstract String answer2();

    protected abstract String answer3();

}
