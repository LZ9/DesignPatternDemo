package com.lodz.android.designpatterndemo.designpattern.prototype.contract;

/**
 * 简历接口
 * Created by zhouL on 2016/11/20.
 */

public interface IResume extends Cloneable{

    void setPersonalInfo(String sex, int age);

    void setWorkExperience(String timeArea, String company);

    void display();
}
