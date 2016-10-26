package com.java.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface InvocationInterface {
	void setName(String name);

	String getName();
}

class InvocationTest2 implements InvocationInterface {

	private String name;

	@Override
	public void setName(String name) {
		this.name = name + "2";
	}

	@Override
	public String getName() {
		return name;
	}

}

public class InvocationTest implements InvocationInterface {

	private String name;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {

		InvocationTest invocationTest = new InvocationTest();
		InvocationTest2 invocationTest2 = new InvocationTest2();

		InvocationInterface invocationInterface = (InvocationInterface) Proxy.newProxyInstance(
				InvocationInterface.class.getClassLoader(), new Class[] { InvocationInterface.class },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						method.invoke(invocationTest, args);
						return method.invoke(invocationTest2, args);
					}
				});

		invocationInterface.setName("swift");
		System.out.println("name:" + invocationInterface.getName());

		// ��̬�������˼�� ͨ��������� Proxy
		// ���������ӿڣ�����������ӿ������÷�����������д��һ����̬�����֮�����еĸĽӿڵ�ʵ�ֵ���set get Ҳ��ִ�ж�̬����

		// �ܽ���˵����������̬����ע���ֻ�ǽӿڷ����ĵ��ã�����Ļ���Ҫ�� invoke ��һ�����������ĸ�ʵ�������е��÷�����
	}

}
