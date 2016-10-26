package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SOSO {

	public static void main(String[] args) {

		String[] aaa = "aaa".split(",");
		System.out.println(aaa.length);
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		System.out.println("--------------------------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		String dateStart = simpleDateFormat.format(new Date());
		
		try {
			SimpleDateFormat simpleDateFormats = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date startDate = simpleDateFormats.parse(dateStart);
			System.out.println(startDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		ArrayList<String> list = new ArrayList<>();

		// String code = "sdfklkj98";
		// String pre = code.substring(0, code.length()- 2);
		// System.out.println(pre);
		// int number = Integer.parseInt(code.substring(code.length() - 2)) + 1;
		// code = pre + (number < 10 ? "0" + number : String.valueOf(number));
		// System.out.println(code);

		// String productLabel = "sss1122";
		// System.out.println(productLabel.substring(productLabel.length() - 4,
		// productLabel.length() - 2));
		//
		// String a = null;
		//
		// String c = (String) null;
		//
		// System.out.println(c);
		//
		//

		list.add("a");
		list.add("b");
		System.out.println(list.toString());
		System.out.println(list.toString().replace("[", "").replace("]", "").replace(" ", "").replace(",", "\n"));

		System.out.println(list.size());
		String[] a = new String[list.size()];
		System.out.println(list.toArray(a));
		System.out.println(a[0]);

		System.out.println(list.toArray().length);

	}
}
