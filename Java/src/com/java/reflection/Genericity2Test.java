package com.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class Genericity2Test {

	private List<String> list;

	public void setList(List<String> list) {
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public static void main(String[] args) throws Exception {

		// �������ط���

		Method method = Genericity2Test.class.getDeclaredMethod("getList");

		System.out.println("return Type:\n\t" + method.getReturnType()); // ��÷�������

		Type returnType = method.getGenericReturnType(); // ��ô����͵ķ�������

		System.out.println("return generic Type:\n\t" + returnType);

		if (returnType instanceof ParameterizedType) {

			ParameterizedType type = (ParameterizedType) returnType;

			Type[] typeArguments = type.getActualTypeArguments();

			for (Type typeArgument : typeArguments) {

				Class<?> typeArgClass = (Class<?>) typeArgument;

				System.out.println(typeArgClass);
			}
		}

		// ������������

		method = Genericity2Test.class.getMethod("setList", List.class);

		Type[] genericParameterTypes = method.getGenericParameterTypes();

		for (Type genericParameterType : genericParameterTypes) {

			if (genericParameterType instanceof ParameterizedType) {

				ParameterizedType aType = (ParameterizedType) genericParameterType;

				Type[] parameterArgTypes = aType.getActualTypeArguments();

				for (Type parameterArgType : parameterArgTypes) {

					Class<?> parameterArgClass = (Class<?>) parameterArgType;

					System.out.println("parameterArgClass = " + parameterArgClass);
				}
			}
		}

		// �ֶη���

		Field field = Genericity2Test.class.getDeclaredField("list");

		Type genericFieldType = field.getGenericType();

		if (genericFieldType instanceof ParameterizedType) {

			ParameterizedType aType = (ParameterizedType) genericFieldType;

			Type[] fieldArgTypes = aType.getActualTypeArguments();

			for (Type fieldArgType : fieldArgTypes) {

				Class<?> fieldArgClass = (Class<?>) fieldArgType;

				System.out.println("fieldArgClass = " + fieldArgClass);
			}
		}
	}
}
