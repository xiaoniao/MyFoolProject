package com.amazing.finalTest;

import com.amazing.Person;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 18;
		Hello hello = create1_8(p);

		p = new Person();
		p.age = 0;
		hello.hi();
	}

	public static Hello create1_8(Person p) { // ������һ�ݿ��������ǿ����Ǹ���ģ��ڲ��Ŀ���������������ָ���ı����������ⲿ�Ŀ�������ָ�ɱ��������ǲ���Ӱ�쵽�ڲ�
		return new Hello() {

			@Override
			public void hi() {
				System.out.println(p.age);
				p.age = 21;
				
				// 1.8�������ⲿ�ı���������������ָ�����
				// Local variable p defined in an enclosing scope must be final or effectively final
				// p = new Person();
				// p.age = 19;
			}
		};
	}
}
