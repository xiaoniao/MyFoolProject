package com.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	
@Override
public boolean equals(Object obj) { return super.equals(obj); }

@Override
public int hashCode() { return super.hashCode(); }
	
	public static interface MyInterface {

		int sum(int arg1, int arg2);

		MyInterface returnMySelf();

	}

	public static void main(String[] args) {

		Object proxyInstance = Proxy.newProxyInstance(MyInterface.class.getClassLoader(),
				new Class[] { MyInterface.class }, new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						System.out.println("A");
						
						if (method.getName().equals("sum")) {
							return (int) args[0] + (int) args[1];
						} else if (method.getName().equals("returnMySelf")) {
							return proxy;
						}
						return null;
					}
				});

		MyInterface myInterface = (MyInterface) proxyInstance;
		
		System.out.println(myInterface.sum(1, 2));
	}

}
