package com.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {

	private static String TAG = "FieldTest";

	private String name;
	public int age;
	public Integer sex;

	private String getName() {
		return name;
	}

	public static void main(String[] args) throws Exception {

		FieldTest fieldTest = new FieldTest();

		// ��� public �ֶ�
		Field[] publicFields = FieldTest.class.getFields();
		for (Field field : publicFields) {
			System.out.println(field);
		}

		// ������е��ֶ�
		Field[] fieldsValue = FieldTest.class.getDeclaredFields();
		for (Field field : fieldsValue) {
			if (field.getType() == String.class && !Modifier.isStatic(field.getModifiers())) {
				field.set(fieldTest, "swift");
			} else if (field.getType() == Integer.class || field.getType() == int.class) {
				field.set(fieldTest, 1);
			}
		}

		// ������е��ֶ�
		Field[] fields = FieldTest.class.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(MyObject.translateModifier(field.getModifiers()) + field.getType().getSimpleName() + " "
					+ field.getName() + " " + field.get(fieldTest));
		}

		// ��̬�ֶε���ֵ��ȡֵ ʵ�����Դ� null
		Field staticField = FieldTest.class.getDeclaredField("TAG");

		staticField.set(null, "FieldTest2"); // ��ֵ

		System.out.println(staticField.get(null)); // ȡֵ

	}
}
