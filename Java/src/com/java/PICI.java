package com.java;

import java.util.ArrayList;
import java.util.List;

public class PICI {

	public static void main(String[] args) {

		List<String> labelList = new ArrayList<String>();

		labelList.add("pppppppp0022");
		labelList.add("pppppppp0122");
		String[] lables = { "pppppppp0323", "pppppppp0124" };

		System.out.println(isSamePici(labelList, lables));
		
		
	}

	private static boolean isIn(List<String> labelList, String lable) {
		for (String string : labelList) {
			// 相等或者是同批次
			if (string.equals(lable)
					|| string.substring(0, string.length() - 2).equals(lable.substring(0, lable.length() - 2))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 判断是不是同一批次
	 * 
	 * @param lables
	 * @param labelList
	 * @return
	 */
	private static boolean isSamePici(List<String> labelList, String[] lables) {
		for (int i = 0; i < lables.length; i++) {
			if (!isIn(labelList, lables[i])) {
				return false;
			}
		}
		return true;
	}
}
