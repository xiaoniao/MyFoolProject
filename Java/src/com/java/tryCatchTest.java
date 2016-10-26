package com.java;

public class tryCatchTest {

	public static void main(String[] args) {

		MyInterface myInterface = new MyInterface() {

			@Override
			public void show(int i) {
				System.out.println("I : " + i);
			}
		};
		System.out.println(test(myInterface));
	}

	public static int test(MyInterface myInterface) {
		try {
			return 0 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("A");
			myInterface.show(2);
			return 2;
		} finally {
			System.out.println("B");
			myInterface.show(1);
			return 1;
		}
	}

	public interface MyInterface {
		void show(int i);
	}
}
