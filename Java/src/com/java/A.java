package com.java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.java.pojo.Fitting;
import com.java.pojo.Result;

public abstract class A {

	private static List<String> list = new ArrayList<>();

	public abstract void testdd();

	public A() {
		list.add("1");
	}

	public static List<String> getList() {
		return list;
	}

	public static void main(String[] args) {
//		Fitting fitting = new Fitting();
//		fitting.setFittingCode("PJ4XOB2000137");
//		fitting.setFittingID(10363);
//		fitting.setFittingName("²¨ÂÖ");
//		fitting.setPattern("7.0");
//
//		Result<Fitting> result = new Result<>();
//		result.setErrorCode("0");
//		result.setReason(null);
//		result.setResult(fitting);
//
//		System.out.println(new Gson().toJson(result));
//
//		System.out.println(1.0 / (float) 500);
//		System.out.println((float) (Math.log(0.78) / Math.log(0.9)));
		
		
	}

	public boolean isA() {
		return false;
	}

}
