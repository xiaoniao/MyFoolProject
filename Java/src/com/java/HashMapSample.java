package com.java;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("n", "j");
		for (Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
