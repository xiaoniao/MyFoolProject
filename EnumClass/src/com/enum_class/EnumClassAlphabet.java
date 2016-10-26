package com.enum_class;

/**
 * 编译器为枚举生成的类
 * 
 * public class EnumClassAlphabet extends Enum<EnumClassAlphabet>
 * 
 * 编译生成的类会继承 Enum<EnumClassAlphabet>，但是编译器不允许继承Enum类
 *
 */
public class EnumClassAlphabet {

	public static EnumClassAlphabet[] VALUES;

	public static final EnumClassAlphabet a;
	public static final EnumClassAlphabet b;
	public static final EnumClassAlphabet c;
	public static final EnumClassAlphabet d;

	static {
		a = new EnumClassAlphabet();
		b = new EnumClassAlphabet();
		c = new EnumClassAlphabet();
		d = new EnumClassAlphabet();
		VALUES = new EnumClassAlphabet[] { a, b, c, d };
	}

	public static EnumClassAlphabet[] values() {
		return VALUES;
	}

	public static EnumClassAlphabet valueOf(String value) {
		return null;
	}
}
