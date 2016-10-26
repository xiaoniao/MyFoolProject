package com.java.reflection;

import java.lang.reflect.Constructor;

/**
 * 构造方法
 *
 */
public class ConstructorTest {

	private String name = "swift";

	public String getName() {
		return name;
	}

	private ConstructorTest() {
		
	}

	private ConstructorTest(String name) {
		this.name = name;
	}

	protected ConstructorTest(String name, String name2) {
		this.name = name;
	}

	public ConstructorTest(String name, String name2, String name3) {
		this.name = name;
	}

	// getConstructor 是查找 public 方法，getDeclaredConstructor是找声明的方法 
	public static void main(String[] args) {

		// private ConstructorTest() 
		try {
			Constructor<ConstructorTest> cc = ConstructorTest.class.getDeclaredConstructor();
			ConstructorTest test = cc.newInstance();
			System.out.println(test.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// private ConstructorTest(String name)
		try {
			Constructor<ConstructorTest> cc = ConstructorTest.class.getDeclaredConstructor(String.class);
			ConstructorTest test = cc.newInstance("apple");
			System.out.println(test.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// protected ConstructorTest(String name, String name2)
		try {
			Constructor<ConstructorTest> cc = ConstructorTest.class.getDeclaredConstructor(String.class, String.class);
			ConstructorTest test = cc.newInstance("apple", "apple");
			System.out.println(test.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// public ConstructorTest(String name, String name2, String name3)
		try {
			Constructor<ConstructorTest> cc = ConstructorTest.class.getDeclaredConstructor(String.class, String.class, String.class);
			ConstructorTest test = cc.newInstance("apple", "apple", "apple");
			System.out.println(test.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
