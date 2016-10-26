package com.java.reflection;

public interface MyInterface {

	void euroCup();

	class A implements MyInterface {

		@Override
		public void euroCup() {

		}
	}

	/**
	 * 各种获得名字
	 */
	public static void main(String[] args) {

		System.out.println("\nMyInterface:\n");

		System.out.println(MyInterface.class.getName()); // com.java.reflection.MyInterface
		System.out.println(MyInterface.class.getSimpleName()); // MyInterface
		System.out.println(MyInterface.class.getCanonicalName()); // com.java.reflection.MyInterface
		System.out.println(MyInterface.class.getTypeName()); // com.java.reflection.MyInterface

		System.out.println("\nmyInterface:\n");

		MyInterface myInterface = new A();

		System.out.println(myInterface.getClass().getName()); // com.java.reflection.MyInterface$A
		System.out.println(myInterface.getClass().getSimpleName()); // A
		System.out.println(myInterface.getClass().getCanonicalName()); // com.java.reflection.MyInterface.A
		System.out.println(myInterface.getClass().getTypeName()); // com.java.reflection.MyInterface$A

		System.out.println("\nInteger:\n");

		System.out.println(Integer.class.getName()); // java.lang.Integer
		System.out.println(Integer.class.getSimpleName()); // Integer
		System.out.println(Integer.class.getCanonicalName()); // java.lang.Integer
		System.out.println(Integer.class.getTypeName()); // java.lang.Integer

		System.out.println("\nInteger[]:\n");

		Integer[] array = new Integer[10];
		System.out.println(array.getClass().getName()); // [Ljava.lang.Integer;
		System.out.println(array.getClass().getSimpleName()); // Integer[]
		System.out.println(array.getClass().getCanonicalName()); // java.lang.Integer[]
		System.out.println(array.getClass().getTypeName()); // java.lang.Integer[]

	}

}
