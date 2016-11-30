package com.lodz.android.designpatterndemo.designpattern.template.test;

/**
 * 学生B的答卷
 * Created by zhouL on 2016/11/30.
 */
public class TestPaperB extends TestPaper{

    @Override
    protected String answer1() {
        return "B";
    }

    @Override
    protected String answer2() {
        return "A";
    }

    @Override
    protected String answer3() {
        return "C";
    }

}
