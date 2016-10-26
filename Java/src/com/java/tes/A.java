package com.java.tes;

public class A {

	// private class KeyboardListener {
	//
	// }
	//
	// public interface KeyboardListener {
	// void keyboardEventChange(String eventName);
	// }

	public static void main(String[] args) {

		int b = 1;
		int i = 1;
		switch (i) {
		case 0 | 1:
			System.out.println("A");
			break;
		case 2 | 3:
			System.out.println("B");
			break;
		default:
			break;
		}
		System.out.println(0 | 1);
		System.out.println(2 | 3);

		String tag = "1";
		switch (tag) {
		case "1":
			System.out.println("AAA");
			break;

		default:
			break;
		}
	}
}
