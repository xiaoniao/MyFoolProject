package com.java.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IVehical {
	void run();
}

class Car implements IVehical {

	public void run() {
		System.out.println("Car is running");
	}
}

public class VehicalProxy {

	public IVehical create() {
		return (IVehical) Proxy.newProxyInstance(IVehical.class.getClassLoader(), new Class[] { IVehical.class },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("invoke");
						return null;
					}
				});
	}

	public static void main(String[] args) {

		VehicalProxy proxy = new VehicalProxy();

		IVehical proxyObj = proxy.create();
		proxyObj.run();

		IVehical car = new Car();
		car.run();
	}
}
