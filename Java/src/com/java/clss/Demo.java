package com.java.clss;

public class Demo {

	public static void main(String[] args) {
		Hello h = new Hello();
		
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Hello {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize()");
		super.finalize();
	}
}
