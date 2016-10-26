package com.enum_class;

public class EnumClass {

	/**
	 * http://docs.oracle.com/javase/7/docs/api/java/lang/Enum.html
	 * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
	 * http://tutorials.jenkov.com/java/enums.html
	 */
	enum Alphabet {
		a, b
	}

	public static void main(String[] args) {
		System.out.println(Alphabet.a + " " + Alphabet.a.ordinal());
		System.out.println(Alphabet.b + " " + Alphabet.b.ordinal());
	}
}
