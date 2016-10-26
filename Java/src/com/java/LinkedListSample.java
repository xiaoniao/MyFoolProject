package com.java;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedListSample {

	public static void main(String[] args) {
		System.out.println("null == null : " + (null == null));
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.push("1"); // 在最前面添加元素
		try {
			System.out.println("first: " + linkedList.getFirst());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("last: " + linkedList.getLast());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		System.out.println(linkedList.add("2"));// 往后追加
		System.out.println(linkedList.add("3"));// 往后追加
		System.out.println(linkedList.peek()); // 第一个元素，但不删除
		System.out.println(linkedList.poll()); // 返回第一个元素，并删除
		System.out.println(linkedList.pop());// 同上但是没有第一个元素的时候，会抛出异常NoSuchElementException
		System.out.println(linkedList.pop());
		try {
			System.out.println(linkedList.pop());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		for (String string : linkedList) {
			System.out.println("list: " + string);
		}

		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(null);
		for (String string : linkedList) {
			System.out.println("list1: " + string);
		}
		linkedList.remove(null);
		for (String string : linkedList) {
			System.out.println("list2: " + string);
		}

		System.out.println("迭代器模式");
		/**
		 * 迭代器模式
		 */
		ListIterator<String> listIterator = linkedList.listIterator();
		for (String string : linkedList) {
			System.out.println("iterator for: " + string);
		}
		System.out.println("hasNext:" + listIterator.hasNext());
		System.out.println("hasPrevious:" + listIterator.hasPrevious());
		while (listIterator.hasNext()) {
			System.out.println("iterator while: " + listIterator.next());
		}

		listIterator.add("11111"); // ListItr还可以通过迭代器模式来添加元素
		for (String string : linkedList) {
			System.out.println("list3: " + string);
		}
	}
}
