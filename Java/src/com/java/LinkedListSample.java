package com.java;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LinkedListSample {

	public static void main(String[] args) {
		System.out.println("null == null : " + (null == null));
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.push("1"); // ����ǰ�����Ԫ��
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

		System.out.println(linkedList.add("2"));// ����׷��
		System.out.println(linkedList.add("3"));// ����׷��
		System.out.println(linkedList.peek()); // ��һ��Ԫ�أ�����ɾ��
		System.out.println(linkedList.poll()); // ���ص�һ��Ԫ�أ���ɾ��
		System.out.println(linkedList.pop());// ͬ�ϵ���û�е�һ��Ԫ�ص�ʱ�򣬻��׳��쳣NoSuchElementException
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

		System.out.println("������ģʽ");
		/**
		 * ������ģʽ
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

		listIterator.add("11111"); // ListItr������ͨ��������ģʽ�����Ԫ��
		for (String string : linkedList) {
			System.out.println("list3: " + string);
		}
	}
}
