package com.lodz.android.designpatterndemo.designpattern.factorymethod;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lodz.android.designpatterndemo.R;
import com.lodz.android.designpatterndemo.base.BaseActivity;
import com.lodz.android.designpatterndemo.designpattern.factorymethod.operation.Operation;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 简单工厂模式
 * Created by zhouL on 2016/11/5.
 */

public class FactoryMethodPatternActivity extends BaseActivity {

    /** 加法运算 */
    @BindView(R.id.operation_add)
    Button mOperationAdd;
    /** 减法运算 */
    @BindView(R.id.operation_subtract)
    Button mOperationSubtract;
    /** 乘法运算 */
    @BindView(R.id.operation_multiply)
    Button mOperationMultiply;
    /** 除法运算 */
    @BindView(R.id.operation_divide)
    Button mOperationDivide;
    /** 结果 */
    @BindView(R.id.result)
    TextView mResult;
    /** 第一位数输入框 */
    @BindView(R.id.num_two_edit_text)
    EditText mNumTwoEditText;
    /** 第二位数输入框 */
    @BindView(R.id.num_one_edit_text)
    EditText mNumOneEditText;

    public static void start(Context context){
        Intent intent = new Intent();
        intent.setClass(context, FactoryMethodPatternActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_factory_method_pattern_layout;
    }

    @Override
    protected void findViews() {
        ButterKnife.bind(this);
    }

    @Override
    protected void setListeners() {
        super.setListeners();
        mOperationAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationAdd();
            }
        });

        mOperationSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationSubtract();
            }
        });

        mOperationMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationMultiply();
            }
        });

        mOperationDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationDivide();
            }
        });
    }

    /** 加法运算 */
    private void operationAdd() {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_ADD);
        if (operation == null){
            mResult.setText(getString(R.string.operation_type_error));
            return;
        }
        mNumTwoEditText.getText();
        operation.setNumberOne(getNum(mNumOneEditText.getText().toString()));
        operation.setNumberTwo(getNum(mNumTwoEditText.getText().toString()));
        mResult.setText(getString(R.string.operation_result, operation.getResult()+""));
    }

    /** 减法运算 */
    private void operationSubtract() {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_SUBTRACT);
        if (operation == null){
            mResult.setText(getString(R.string.operation_type_error));
            return;
        }
        operation.setNumberOne(getNum(mNumOneEditText.getText().toString()));
        operation.setNumberTwo(getNum(mNumTwoEditText.getText().toString()));
        mResult.setText(getString(R.string.operation_result, operation.getResult()+""));
    }

    private void operationMultiply() {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_MULTIPLY);
        if (operation == null){
            mResult.setText(getString(R.string.operation_type_error));
            return;
        }
        operation.setNumberOne(getNum(mNumOneEditText.getText().toString()));
        operation.setNumberTwo(getNum(mNumTwoEditText.getText().toString()));
        mResult.setText(getString(R.string.operation_result, operation.getResult()+""));
    }

    /** 除法运算 */
    private void operationDivide() {
        Operation operation = OperationFactory.createOperation(OperationFactory.OPERATION_DIVIDE);
        if (operation == null){
            mResult.setText(getString(R.string.operation_type_error));
            return;
        }
        operation.setNumberOne(getNum(mNumOneEditText.getText().toString()));
        operation.setNumberTwo(getNum(mNumTwoEditText.getText().toString()));
        try {
            mResult.setText(getString(R.string.operation_result, operation.getResult()+""));
        } catch (Exception e) {
            e.printStackTrace();
            mResult.setText("除数不能为零");
        }
    }

    /** 获取用户输入的数字 */
    private float getNum(String num){
        if (TextUtils.isEmpty(num)){
            return 0f;
        }
        try {
            return Float.valueOf(num);
        }catch (Exception e){
            e.printStackTrace();
            return 0f;
        }
    }

}
