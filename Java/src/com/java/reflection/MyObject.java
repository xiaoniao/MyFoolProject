package com.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class MyObject implements MyInterface {

	// ���췽��

	private MyObject() {

	}

	private MyObject(String a) {

	}

	protected MyObject(String a, String b) {

	}

	public MyObject(String a, String b, String c) {

	}

	private String age;
	protected String age2;
	public String age3;

	public void hello() {
		world();
	}

	// private ����������ʾ������
	private void world() {

	}

	protected void taller() {

	}

	public abstract void swift();

	/**
	 * ����ʱ֪�������Ϣ
	 * 
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {

		Class<MyObject> cls = MyObject.class;

		// ��� public �ķ���
		Method[] methods = cls.getMethods();

		for (Method method : methods) {
			System.out.println("methods:" + method.getName() + "," + translateModifier(method.getModifiers()));
		}

		cls = (Class<MyObject>) Class.forName("com.java.reflection.MyObject");

		// ��������ķ���
		Method[] decalreMethods = cls.getDeclaredMethods();

		for (Method method : decalreMethods) {
			System.out.println("decalreMethods:" + method.getName() + "," + translateModifier(method.getModifiers()));
		}

		// package
		Package pck = MyObject.class.getPackage();
		System.out.println("package:" + pck.getName());

		// ����
		System.out.println(MyObject.class.getSuperclass().getName());

		// �ӿ�
		Class<?>[] interfaces = MyObject.class.getInterfaces();
		for (Class<?> class1 : interfaces) {
			System.out.println(class1.getName());
		}

		// ���췽��

		Constructor<?>[] constructor = MyObject.class.getConstructors(); // public

		for (Constructor<?> constructor2 : constructor) {
			System.out.println("Constructor:" + constructor2 + translateModifier(constructor2.getModifiers()));
		}

		Constructor<?>[] declaredConstructor = MyObject.class.getDeclaredConstructors(); // ������
		for (Constructor<?> constructor2 : declaredConstructor) {
			System.out.println("DeclaredConstructor:" + constructor2 + translateModifier(constructor2.getModifiers()));

			Class<?>[] parameterTypes = constructor2.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				System.out.println("\t\t" + class1);
			}
		}

		// �ֶ�
		Field[] fileds = MyObject.class.getFields(); // public
		for (Field field : fileds) {
			System.out.println(field);
		}

		Field[] declareFileds = MyObject.class.getDeclaredFields();
		for (Field field : declareFileds) {
			System.out.println(field);
		}

		// ע��
		Annotation[] annotations = MyObject.class.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
	}

	public static strictfp String translateModifier(int modifiers) {
		StringBuffer stringBuffer = new StringBuffer();

		if (Modifier.isAbstract(modifiers)) {
			stringBuffer.append("abstract ");
		}
		if (Modifier.isFinal(modifiers)) {
			stringBuffer.append("final ");
		}
		if (Modifier.isInterface(modifiers)) {
			stringBuffer.append("interface ");
		}
		if (Modifier.isNative(modifiers)) {
			stringBuffer.append("native ");
		}
		if (Modifier.isPrivate(modifiers)) {
			stringBuffer.append("private ");
		}
		if (Modifier.isProtected(modifiers)) {
			stringBuffer.append("protected ");
		}
		if (Modifier.isPublic(modifiers)) {
			stringBuffer.append("public ");
		}
		if (Modifier.isStatic(modifiers)) {
			stringBuffer.append("static ");
		}
		if (Modifier.isStrict(modifiers)) {
			stringBuffer.append("strict ");
		}
		if (Modifier.isSynchronized(modifiers)) {
			stringBuffer.append("synchronized ");
		}
		if (Modifier.isTransient(modifiers)) {
			stringBuffer.append("transient ");
		}
		if (Modifier.isVolatile(modifiers)) {
			stringBuffer.append("volatile ");
		}
		return stringBuffer.toString();
	}

}
