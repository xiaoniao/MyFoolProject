package com.java;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");

		String value = set.toString();
		
		System.out.println(value);
		System.out.println(value.replace("[", "").replace("]", "").replace(",", ""));

	}
}
