package com.java.bigfile;

public class TestMethod {

	public TestMethod() {
		try {
			SiteInfoBean bean = new SiteInfoBean("http://192.168.0.180:8080/wms/assets/apk/jdk-7u13-windows-i586.exe",
					"F:\\BigFile", "jdk-7u13-windows-i586.exe", 5);
			SiteFileFetch fileFetch = new SiteFileFetch(bean);
			fileFetch.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TestMethod();
	}
}