package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringUtils {

	private static final char[] ALPHANUM = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c',
			'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
			'y', 'z' };

	public static boolean isEmpty(CharSequence str) {
		if (str == null || str.length() == 0)
			return true;
		else
			return false;
	}

	public static String generateRandomCode() {
		Random random = new Random();
		return String.valueOf(ALPHANUM[random.nextInt(36)]) + String.valueOf(ALPHANUM[random.nextInt(36)]);
	}

	public static void main(String[] args) {
		// Random random = new Random();
		// for (int i = 0; i < 4000000; i++) {
		// int a = random.nextInt(37);
		// // if (a == 0) {
		// // System.out.println("0");
		// // }
		// if (a == 36) {
		// System.out.println("36");
		// }
		// if (a > 36) {
		// System.out.println(">36");
		//
		// }
		// }
		//
		// generateRandomCode();
		//
		// List<String> s = new ArrayList<>();
		// s.add("\"1\"");
		// s.add("\"2\"");
		// System.out.println(s);

		String string1 = "sjdfhjksadf00_ee";
		String string2 = "sjdfhjksadf00_dd";

		System.out.println(string1.substring(0, string1.lastIndexOf("_")));
	}
}
