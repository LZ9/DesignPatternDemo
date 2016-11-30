package com.lodz.android.designpatterndemo.designpattern.template.test;

/**
 * 学生A的答卷
 * Created by zhouL on 2016/11/30.
 */
public class TestPaperA extends TestPaper{

    @Override
    protected String answer1() {
        return "D";
    }

    @Override
    protected String answer2() {
        return "C";
    }

    @Override
    protected String answer3() {
        return "B";
    }
}
