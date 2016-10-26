package com.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainTest {

	interface Foo {

		void hello();
	}

	public static void main(String[] args) {
		
		InvocationHandler handler = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

				// 利用反射在invoke()方法里实现需求：

				System.out.println(">>" + method.getName());

				return null;
			}
		};

		// Class<?> proxyClass = Proxy.getProxyClass(Foo.class.getClassLoader(),
		// new Class[] { Foo.class });
		//
		// try {
		// Foo f = (Foo) proxyClass.getConstructor(new Class[] {
		// InvocationHandler.class })
		// .newInstance(new Object[] { handler });
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		Foo foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[] { Foo.class }, handler);

		System.out.println();
	}
}
