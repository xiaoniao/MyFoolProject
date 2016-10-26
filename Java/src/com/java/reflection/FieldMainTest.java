package com.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldMainTest {

	public static void main(String[] args) throws Exception {

		FieldTest fieldTest = new FieldTest();

		Field name = FieldTest.class.getDeclaredField("name");

		// 关闭 name 字段 作用域访问权限
		name.setAccessible(true);

		name.set(fieldTest, "swift");

		System.out.println(name.get(fieldTest));

		Method method = FieldTest.class.getDeclaredMethod("getName");

		// 关闭访问权限
		method.setAccessible(true);

		Object value = method.invoke(fieldTest);

		System.out.println(value);
	}
}
