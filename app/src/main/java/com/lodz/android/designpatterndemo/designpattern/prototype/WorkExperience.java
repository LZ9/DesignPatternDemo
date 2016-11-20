package com.lodz.android.designpatterndemo.designpattern.prototype;

/**
 * 工作经历
 * Created by zhouL on 2016/11/20.
 */

public class WorkExperience implements Cloneable{

    public String timeArea = "";

    public String company = "";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
