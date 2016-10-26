package com.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldMainTest {

	public static void main(String[] args) throws Exception {

		FieldTest fieldTest = new FieldTest();

		Field name = FieldTest.class.getDeclaredField("name");

		// �ر� name �ֶ� ���������Ȩ��
		name.setAccessible(true);

		name.set(fieldTest, "swift");

		System.out.println(name.get(fieldTest));

		Method method = FieldTest.class.getDeclaredMethod("getName");

		// �رշ���Ȩ��
		method.setAccessible(true);

		Object value = method.invoke(fieldTest);

		System.out.println(value);
	}
}
