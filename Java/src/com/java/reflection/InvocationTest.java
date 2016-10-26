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

		// 动态代理的意思是 通过反射里的 Proxy
		// 类来创建接口，并适用这个接口来调用方法，而不是写了一个动态代理后之后所有的改接口的实现调用set get 也会执行动态代理

		// 总结来说是这样，动态代理注入的只是接口方法的调用，具体的还是要看 invoke 第一个参数即由哪个实例来进行调用方法的
	}

}
