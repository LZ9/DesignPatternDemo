package com.lodz.android.designpatterndemo.designpattern.prototype;

import android.util.Log;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.designpattern.prototype.contract.IResume;

/**
 * 简历
 * Created by zhouL on 2016/11/20.
 */

public class Resume implements IResume {

    private String name = "";

    private String sex = "";

    private int age = 0;

    public WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    @Override
    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void setWorkExperience(String timeArea, String company) {
        workExperience.timeArea = timeArea;
        workExperience.company = company;
    }

    @Override
    public void display() {
        Log.d(MainActivity.TAG, "name : " + name + " ; sex : " + sex + " ; age : " + age);
        Log.d(MainActivity.TAG, "工作经历 : " + workExperience.timeArea + " ; 公司 : " + workExperience.company + "\n ");
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExperience);// 深克隆
        resume.name = this.name;
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }
}
