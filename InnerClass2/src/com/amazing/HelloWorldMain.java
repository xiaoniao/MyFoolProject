package com.amazing;

public class HelloWorldMain {

	public static void main(String[] args) {

		// ʹ�ýӿڵ�ʵ����
		HelloWorld helloWordImpl = new HelloWorldImpl();
		String string = helloWordImpl.hi();
		System.out.println(string);

		// ʹ�ýӿ������ڲ���
		HelloWorld helloWorld = new HelloWorld() {

			@Override
			public String hi() {
				return "xiete";
			}
		};
		System.out.println(helloWorld.hi());
	}

}
