package com.java;

public class ViewHolderTest {

	static int count;
	static ViewHolder viewHodler;

	public ViewHolderTest() {
		count++;
		viewHodler = new ViewHolder();
	}

	static class ViewHolder {
		static int a = 0;

		public ViewHolder() {
			a++;
		}
	}

	public static void main(String[] args) {

//		ViewHolderTest[] v = new ViewHolderTest[10];
//		for (int i = 0; i < 10; i++) {
//			v[i] = new ViewHolderTest();
//		}
//		System.out.println(ViewHolderTest.count + " " + ViewHolderTest.viewHodler.a);
//
//		System.out.println(v[9].viewHodler.a + "");
		
		String[] a = new String[0];
		System.out.println(a.length);
		
	}
}
