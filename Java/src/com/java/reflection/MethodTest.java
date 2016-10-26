package com.java.reflection;

import java.lang.reflect.Method;

public class MethodTest {

	private String name;

	private void setName(String name) {
		this.name = name;
	}

	private String getName() {
		return name;
	}

	private static void showExample() {
		System.out.println("showExample");
	}

	/**
	 * 可以执行 private 方法
	 */
	public static void main(String[] args) throws Exception {

		// 实例
		MethodTest instance = MethodTest.class.getConstructor().newInstance();

		// setName
		Method setNameMethod = MethodTest.class.getDeclaredMethod("setName", String.class);

		setNameMethod.invoke(instance, "swift");

		// getName
		Method getNameMethod = MethodTest.class.getDeclaredMethod("getName");

		Object oj = getNameMethod.invoke(instance);

		System.out.println(oj);

		// showExample 静态方法可以不关联实例
		Method staticMethod = MethodTest.class.getDeclaredMethod("showExample");

		staticMethod.invoke(null);

		System.out.print(isSetter(setNameMethod) + " ");
		System.out.print(isGetter(setNameMethod) + "\n");

		System.out.print(isSetter(getNameMethod) + " ");
		System.out.print(isGetter(getNameMethod) + "\n");

		System.out.print(isSetter(staticMethod) + " ");
		System.out.print(isGetter(staticMethod) + "\n");
	}

	public static boolean isGetter(Method method) {

		if (!method.getName().startsWith("get")) {
			return false;
		}
		if (method.getParameterTypes().length != 0) {
			return false;
		}
		if (method.getReturnType().equals(void.class)) {
			return false;
		}

		return true;
	}

	public static boolean isSetter(Method method) {

		if (!method.getName().startsWith("set")) {
			return false;
		}
		if (method.getParameterTypes().length != 1) {
			return false;
		}

		return true;
	}
}
