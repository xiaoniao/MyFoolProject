package com.enum_class;

/**
 * ������Ϊö�����ɵ���
 * 
 * public class EnumClassAlphabet extends Enum<EnumClassAlphabet>
 * 
 * �������ɵ����̳� Enum<EnumClassAlphabet>�����Ǳ�����������̳�Enum��
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
