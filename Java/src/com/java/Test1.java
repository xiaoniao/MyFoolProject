package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {

		System.out.println(String.valueOf(System.currentTimeMillis()).substring(5));

		
		Map<String, String> map = new HashMap<>();
		Random random = new Random();
		System.out.println(random.nextInt(100));
		//
		// List<String> result = new ArrayList<>();
		// String area = "A";
		// int row = 2;
		// int layer = 3;
		// int numbered = 5;
		// String divider = "-";
		//
		// StringBuffer stringBuffer = new StringBuffer();
		// stringBuffer.append(area);
		// for (int i = 1; i <= row; i++) {
		// for (int j = 1; j <= layer; j++) {
		// for (int k = 1; k <= numbered; k++) {
		// stringBuffer.setLength(area.length());
		// stringBuffer.append(divider);
		// stringBuffer.append(i);
		// stringBuffer.append(divider);
		// stringBuffer.append(j);
		// stringBuffer.append(divider);
		// stringBuffer.append(k);
		// System.out.println(stringBuffer);
		// }
		// }
		// }

		List<String> a = new ArrayList<>();
		a.add("1");
		a.add("2");
		a.add("3");
		System.out.println(a.toArray().toString());

		String[] b = { "1", "2" };
//		System.out.println(b.);
		
		String[] arr = "1,2".split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}
}
