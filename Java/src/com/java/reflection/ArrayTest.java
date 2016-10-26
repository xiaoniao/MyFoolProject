package com.java.reflection;

import java.lang.reflect.Array;

public class ArrayTest {

	public static void main(String[] args) throws Exception {

		// 反射创建数组
		int[] array = (int[]) Array.newInstance(int.class, 3);

		// 普通设值方式
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;

		// 通过反射设值
		Array.set(array, 0, 4);
		Array.set(array, 1, 5);
		Array.set(array, 2, 6);

		// 通过反射取值
		System.out.println(Array.getInt(array, 0));
		System.out.println(Array.getInt(array, 1));
		System.out.println(Array.getInt(array, 2));

		// 获取数组的 Class 对象

		Class<?> intArrayClass = int[].class;
		System.out.println(intArrayClass);

		Class<?> intArrayClass2 = Class.forName("[I");
		System.out.println(intArrayClass2);

		// 通过类名获得数组名 取巧的方法
		Class<?> stringArrayClass = Array.newInstance(String.class, 0).getClass();
		System.out.println(stringArrayClass.isArray()); // 是否是数组

		// 获得数组实际类型
		String[] strings = new String[3];
		Class<?> componentClass = strings.getClass().getComponentType();
		System.out.println(componentClass);
	}

	public Class<?> getClass(String className) throws ClassNotFoundException {
		if (className.equals("int"))
			return int.class;
		if (className.equals("short"))
			return short.class;
		if (className.equals("long"))
			return long.class;
		if (className.equals("String"))
			return String.class;
		return Class.forName(className);
	}
}
