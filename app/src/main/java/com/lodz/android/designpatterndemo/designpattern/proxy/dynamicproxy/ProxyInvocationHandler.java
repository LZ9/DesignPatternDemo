package com.lodz.android.designpatterndemo.designpattern.proxy.dynamicproxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理
 * Created by zhouL on 2016/11/9.
 */

public class ProxyInvocationHandler implements InvocationHandler {

    private Object mTarget;

    public ProxyInvocationHandler(Object target) {
        this.mTarget = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Log.i(DynamicProxyActivity.TAG, "----- 代理开始 -----");
        Object result = method.invoke(mTarget, args);
        Log.i(DynamicProxyActivity.TAG, "----- 代理结束 -----");
        return result;
    }

    // 生成代理对象
    public Object getProxy() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = mTarget.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}
