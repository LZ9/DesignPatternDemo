package com.lodz.android.designpatterndemo.designpattern.factorymethod;

import com.lodz.android.designpatterndemo.designpattern.factorymethod.operation.Operation;
import com.lodz.android.designpatterndemo.designpattern.factorymethod.operation.OperationAdd;
import com.lodz.android.designpatterndemo.designpattern.factorymethod.operation.OperationDiv;
import com.lodz.android.designpatterndemo.designpattern.factorymethod.operation.OperationMul;
import com.lodz.android.designpatterndemo.designpattern.factorymethod.operation.OperationSub;

/**
 * 计算工厂
 * Created by zhouL on 2016/11/5.
 */
public class OperationFactory {

    /** 加法运算标识符 */
    public static final int OPERATION_ADD = 1;
    /** 减法运算标识符 */
    public static final int OPERATION_SUBTRACT = 2;
    /** 乘法运算标识符 */
    public static final int OPERATION_MULTIPLY = 3;
    /** 除法运算标识符 */
    public static final int OPERATION_DIVIDE = 4;

    /**
     * 创建运算类型
     * @param operation 运算类型标识符
     */
    public static Operation createOperation(int operation){
        switch (operation){
            case OPERATION_ADD:
                return new OperationAdd(); // 创建加操作运算对象
            case OPERATION_SUBTRACT:
                return new OperationSub(); // 创建减操作运算对象
            case OPERATION_MULTIPLY:
                return new OperationMul(); // 创建乘操作运算对象
            case OPERATION_DIVIDE:
                return new OperationDiv(); // 创建除操作运算对象
            default:
                return null;
        }
    }

}
