package com.lodz.android.designpatterndemo.designpattern.prototype;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.lodz.android.designpatterndemo.MainActivity;
import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 原型模式
 * Created by zhouL on 2016/11/20.
 */

public class PrototypeActivity extends BaseActivity{

    /** 生成简历 */
    @BindView(R.id.create_resume_button)
    Button mCreateResumeButton;

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, PrototypeActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_prototype_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mCreateResumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createResume();
            }
        });
    }

    private void createResume() {
        try {
            Resume resumeA = new Resume("小吴克");
            resumeA.setPersonalInfo("男", 19);
            resumeA.setWorkExperience("1991-2004", "小米公司");

            Resume resumeB = resumeA.clone();
            resumeB.setWorkExperience("1995-2001", "联想股份");

            Resume resumeC = resumeA.clone();
            resumeC.setPersonalInfo("女", 22);

            resumeA.display();
            resumeB.display();
            resumeC.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            Log.e(MainActivity.TAG, e.toString());
        }
    }
}
