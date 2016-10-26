package com.java;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {

	public static void main(String[] args) {
		// List<String> s = new ArrayList<>();
		// s.add("1");
		// s.add("2");
		//
		// List<String> result = s.subList(0, 2);
		// for (String string : result) {
		// System.out.println(string);
		// }
		//
		// int a = 437154;
		// System.out.println(a / 1000.0);
		//
		// DecimalFormat df = new DecimalFormat("#.00");
		// System.out.println(df.format(a / 1000.0));
		//
		// try {
		// ss();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// System.out.println("11");
		//
		// SimpleDateFormat simpleDateFormat = new
		// SimpleDateFormat("yyyyMMddhhmmss");
		// System.out.println(simpleDateFormat.format(new Date()));
		//
		// String label = "PJ16G700507A00605140104";
		// System.out.println(label.substring(label.length() - 4,
		// label.length()- 2));
		// System.out.println(label.substring(label.length() - 8, label.length()
		// - 4));
		//
		// System.out.println(label.substring(0, label.length() - 2));
		//
//		List<String> list = new ArrayList<>();
//		list.add("a");
//		list.add("b");
//
//		String[] arr = new String[list.size()];
//		list.toArray(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		
//		String name = "121212444566654456";
//		System.out.println(name.replaceAll("\\S", "*").substring(1) + name.substring(name.length() - 1));
	
		Pattern pattern = Pattern.compile("^[1-9]\\d*$");
		
		Matcher matcher = pattern.matcher("Q1123456");
		
		if (matcher.find()) {
			System.out.println("AA");
		}
	
	}

	public static void ss() {
		throw new NullPointerException();
	}
}
