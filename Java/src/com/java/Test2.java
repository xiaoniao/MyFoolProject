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
		// // ������ģʽ�Ƿ����ֱ��ɾ��
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
		
		String titleStr = "�û�������,�ļ���˾,��ϵ��,��ϵ�绰,�ļ���ַ,�ռ���˾,��ϵ��,��ϵ�绰,�ֻ�����,�ռ���ϸ��ַ,���ʽ,���������½Ῠ��,�м�������,�м�������,����,ʵ��������KG��,�Ʒ�������KG��,ҵ������,�Ƿ���̼Ӽ�,�Ƿ���ջ���,���ջ�����,�Ƿ񱣼�,���۽��,��׼����װ����Ԫ,�������ã�Ԫ��,�Ƿ���ȡ,�Ƿ�ǩ�ص�,�Ƿ�ʱ����,��������,����ʱ��,�Ƿ��������,�Ƿ񱣵�����,�Ƿ�������֤,�Ƿ��ʷ���,�Ƿ������,�Ƿ��բзר��,�Ƿ�Ʊ��ר��,�ռ�Ա,�ķ�ǩ��,�ļ�����,ǩ�ն���֪ͨ(MSG),�ɼ����ֶ���(SMS),�ķ��ͻ���ע,��(cm),��(cm),��(cm),��չ�ֶ�1,��չ�ֶ�2,��չ�ֶ�3,��ϸ��ַ";
		String[] stitleArray = titleStr.split(",");
		for (String string : stitleArray) {
			System.out.println(string);
		}
	}
}
