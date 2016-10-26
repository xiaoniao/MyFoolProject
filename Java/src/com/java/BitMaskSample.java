package com.java;

public class BitMaskSample {

	public static void main(String[] args) {

		int value = 32767;

		System.out.println(value << 1); // 65534
		System.out.println(value >> 1); // 16383
		System.out.println(value >>> 1); // 16383

		value = -1;

		System.out.println(value << 1); // -2
		System.out.println(value >> 1); // -1
		System.out.println(value >>> 1); // 2147483647

		// >> 高位补1 >>> 高位补0
	}
}
