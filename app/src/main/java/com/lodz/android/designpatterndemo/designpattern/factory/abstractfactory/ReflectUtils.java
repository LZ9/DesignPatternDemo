package com.lodz.android.designpatterndemo.designpattern.factory.abstractfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射帮助类
 * Created by zhouL on 2016/11/13.
 */
public class ReflectUtils {

	/**
	 * 根据类名获取对应的class（类名须包括包名）
	 * @param classPath 类的地址
	 */
	public static Class<?> getClassForName(String classPath)
			throws ClassNotFoundException {
		return Class.forName(classPath);
	}
	
	/**
	 * 获取无参构造函数对象（如果目标对象没有无参构造函数会抛出异常）
	 * @param c 类
	 */
	public static Object getObject(Class<?> c)
			throws IllegalAccessException, InstantiationException {
		return c.newInstance();
	}

	/**
	 * 获取带有参数的构造函数对象
	 * @param c 类
	 * @param classTypes 构造函数的参数类型
	 * @param params 构造函数的具体入参
	 */
	public static Object getObject(Class<?> c, Class<?>[] classTypes, Object[] params)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Constructor<?> constructor = c.getDeclaredConstructor(classTypes);
		constructor.setAccessible(true);// 构造函数是private的话需要设置为true
		return constructor.newInstance(params);
	}

	/**
	 * 执行某个函数
	 * @param c 类
	 * @param object 类的对象
	 * @param functionName 函数名字
	 * @param classTypes 函数的参数类型
	 * @param params 具体入参
	 */
	public static Object executeFunction(Class<?> c, Object object, String functionName, Class<?>[] classTypes, Object[] params)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Method method = c.getMethod(functionName, classTypes);// 方法名和参数类型
		return method.invoke(object, params);// 传参并执行
	}

	/**
	 * 执行某个无参函数
	 * @param c 类
	 * @param object 类的对象
	 * @param functionName 函数名字
	 */
	public static Object executeFunction(Class<?> c, Object object, String functionName)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		return executeFunction(c, object, functionName, null, null);
	}
	
	/**
	 * 获取方法名
	 * @param c 类
	 */
	public static List<String> getMethodName(Class<?> c) {
		List<String> list = new ArrayList<>();
		Method[] methods = c.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			list.add(method.getName());
		}
		return list;
	}
	
	/**
	 * 获取对象里变量的值
	 * @param c 类
	 * @param object 类的对象
	 * @param typeName 变量名称
	 */
	public static Object getFieldValue(Class<?> c, Object object, String typeName)
			throws NoSuchFieldException, IllegalAccessException {
		Field field = c.getDeclaredField(typeName); // 因为msg变量是private的，所以不能用getField方法
		field.setAccessible(true);// 设置是否允许访问，因为该变量是private的，所以要手动设置允许访问，如果msg是public的就不需要这行了。
		return field.get(object);
	}
	
	/**
	 * 获取对象里的变量名称
	 * @param c 类
	 */
	public static List<String> getFieldName(Class<?> c) {
		List<String> list = new ArrayList<>();
		Field[] fields = c.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			list.add(field.getName());
		}
		return list;
	}
	
	/**
	 * 获取所有构造函数名称
	 * @param c 类
	 */
	public static List<String> getConstructorName(Class<?> c) {
		List<String> list = new ArrayList<>();
		Constructor<?>[] constructors = c.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor<?> constructor = constructors[i];
			list.add(constructor.toString());
		}
		return list;
	}
	

}
