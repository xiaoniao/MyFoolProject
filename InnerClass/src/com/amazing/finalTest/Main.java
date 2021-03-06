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

	public static Hello create1_8(Person p) { // 复制了一份拷贝，但是拷贝是隔离的，内部的拷贝不允许再重新指向别的变量，但是外部的可以重新指派变量，但是不会影响到内部
		return new Hello() {

			@Override
			public void hi() {
				System.out.println(p.age);
				p.age = 21;
				
				// 1.8中引用外部的变量不允许再重新指向变量
				// Local variable p defined in an enclosing scope must be final or effectively final
				// p = new Person();
				// p.age = 19;
			}
		};
	}
}
