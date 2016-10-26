package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		Object[] object1 = { "1", "2" };
		Object[] object2 = { "*", "*", "*" };

		System.arraycopy(object1, 0, object2, 1, 2);

		for (Object object : object1) {
			System.out.print(object);
		}
		System.out.println("");
		for (Object object : object2) {
			System.out.print(object);
		}

		// List 的初始因子应该设置为多少？

		System.out.println();
		String name = "刘壮壮";
		System.out.println(name.replaceAll(".", "*").substring(1) + name.charAt(name.length() - 1));

		System.out.println(name.replaceAll(".$", "*"));

		System.out.println(name.replaceAll(".$", "*"));

		name = "KPI";
		System.out.println(name.replaceAll("KPI", "Money"));
		
		
		ArrayList<String> strings = new ArrayList<>(1000000);
		strings.trimToSize();
		
		
		List<String> stringss = Collections.synchronizedList(strings); // 线程安全的集合 是在 List 上又包裹了一层 SynchronizedRandomAccessList 或者  SynchronizedList
		stringss.add("1");
		List<String> subList = stringss.subList(0, 1); // subList 和 list引用的是同一个数组，修改那一个都会影响另一个
		subList.set(0, "a");
		stringss.set(0, "2");
		System.out.println(subList.toString());
		System.out.println(stringss);
	}
	// String a = "世界杯"; // **杯

	// 正则表达式替换除了最后一个字符都为星号，例如 世界杯 替换成 **杯
}
