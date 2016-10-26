package com.java;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	static class A {
		String a;
	}

	public static void main(String[] args) {
		//
		// // String productLabel = "123456L";
		// // productLabel = productLabel.substring(productLabel.length() -
		// // (productLabel.endsWith("L") ? 5 : 4),
		// // productLabel.length() - (productLabel.endsWith("L") ? 3 : 2));
		// // System.out.println(productLabel);
		//
		// //
		// // System.out.println("1111111111111111");
		// // A dd = new A();
		// // dd.a = "1";
		// // String c = new String("1");
		// // System.out.println(dd.a == "1");
		// // System.out.println(c == "1");
		// //
		// // 跌带起模式是否可以直接删除
		// List<String> list = new ArrayList<>();
		// list.add("1");
		// list.add("2");
		// list.add("3");
		//
		// // for (String string : list) {
		// // if (string.equals("1")) {
		// // list.remove(string);
		// // }
		// // }
		//
		// for (String string : list) {
		// System.out.println(string);
		// }
		//
		// String[] string = new String[list.size()];
		// list.toArray(string);
		// for (String string2 : string) {
		// System.out.println(string2);
		// }
		//
		// int count = 0;
		// for (int a = 10000; a <= 99999; a++) {
		// for (int b = 1000; b <= 9999; b++) {
		// if (a - b == 33333) {
		// if (!String.valueOf(a).contains("0") &&
		// !String.valueOf(b).contains("0")) {
		// String str = String.valueOf(a) + String.valueOf(b);
		// if (str.contains("1") && str.contains("2")
		// && str.contains("2")
		// && str.contains("3")
		// && str.contains("4")
		// && str.contains("5")
		// && str.contains("6")
		// && str.contains("7")
		// && str.contains("8")
		// && str.contains("9")) {
		// System.out.println("a:" + a + " b:" + b);
		// count ++;
		// }
		// }
		// }
		// }
		// }
		// System.out.println(count);
		//
		
		String titleStr = "用户订单号,寄件公司,联系人,联系电话,寄件地址,收件公司,联系人,联系电话,手机号码,收件详细地址,付款方式,第三方付月结卡号,托寄物内容,托寄物数量,件数,实际重量（KG）,计费重量（KG）,业务类型,是否电商加急,是否代收货款,代收货款金额,是否保价,保价金额,标准化包装服务（元,其它费用（元）,是否自取,是否签回单,是否定时派送,派送日期,派送时段,是否电子验收,是否保单配送,是否拍照验证,是否保鲜服务,是否易碎件,是否大闸蟹专递,是否票据专送,收件员,寄方签名,寄件日期,签收短信通知(MSG),派件出仓短信(SMS),寄方客户备注,长(cm),宽(cm),高(cm),扩展字段1,扩展字段2,扩展字段3,详细地址";
		String[] stitleArray = titleStr.split(",");
		for (String string : stitleArray) {
			System.out.println(string);
		}
	}
}
