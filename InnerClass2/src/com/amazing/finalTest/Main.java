package com.amazing.finalTest;

import com.amazing.Person;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 18;
		Hello hello = create1_6(p);

		p = new Person();
		p.age = 0;
		hello.hi();
		
		s();
	}

	public static Hello create1_6(final Person p) { // ������һ�ݿ��������ǿ����Ǹ���ģ��ڲ��Ŀ���������������ָ���ı����������ⲿ�Ŀ�������ָ�ɱ��������ǲ���Ӱ�쵽�ڲ�
		return new Hello() {

			@Override
			public void hi() {
				System.out.println(p.age);
				p.age = 21;
			}
		};
	}
	
	public static final void s() {
		final String name = "sss";
		System.out.println(name);
	}
}
