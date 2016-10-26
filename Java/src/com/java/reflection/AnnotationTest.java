package com.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@MyClassAnnotation(name = "apple", value = "swift")
public class AnnotationTest {

	@MyFieldAnnotation(name = "11", value = "11")
	private String name;

	@MyMethodAnnotation(name = "22", value = "22")
	private String getName() {
		return name;
	}

	private void setName(@MyParameterAnnotation(name = "33", value = "33") String name) {
		this.name = name;
	}

	public static void main(String[] args) throws Exception {

		// class
		Annotation[] annotations = AnnotationTest.class.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof MyClassAnnotation) {
				MyClassAnnotation classAnnotation = (MyClassAnnotation) annotation;
				System.out.println(classAnnotation.name());
				System.out.println(classAnnotation.value());
			}
		}

		// field
		Field name = AnnotationTest.class.getDeclaredField("name");
		annotations = name.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof MyFieldAnnotation) {
				MyFieldAnnotation fidleAnnotation = (MyFieldAnnotation) annotation;
				System.out.println(fidleAnnotation.name());
				System.out.println(fidleAnnotation.value());
			}
		}

		MyFieldAnnotation myFieldAnnotation = name.getAnnotation(MyFieldAnnotation.class);
		System.out.println(myFieldAnnotation.name());
		System.out.println(myFieldAnnotation.value());

		// method
		Method method = AnnotationTest.class.getDeclaredMethod("getName");
		annotations = method.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof MyMethodAnnotation) {
				MyMethodAnnotation methodAnnotation = (MyMethodAnnotation) annotation;
				System.out.println(methodAnnotation.name());
				System.out.println(methodAnnotation.value());
			}
		}

		// parameter
		method = AnnotationTest.class.getDeclaredMethod("setName", String.class);
		Annotation[][] parameterAnnotations = method.getParameterAnnotations();
		
		Class<?>[] parameterTypes = method.getParameterTypes();
		Parameter[] parameters = method.getParameters();
		
		int i = 0;
		for (Annotation[] annotations2 : parameterAnnotations) {
			
			Class<?> parameterType = parameterTypes[i];
			Parameter parameter = parameters[i];
			i++;
			
			for (Annotation annotation : annotations2) {
				if (annotation instanceof MyParameterAnnotation) {
					MyParameterAnnotation parameterAnnotation = (MyParameterAnnotation) annotation;
					System.out.print(parameter.getName() + " ");
					System.out.print(parameterType.getSimpleName() + " ");
					System.out.print(parameterAnnotation.name() + " ");
					System.out.print(parameterAnnotation.value() + " ");
				}
			}
		}
	}
}

// 类注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyClassAnnotation {

	public String name();

	public String value();
}

// 方法注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyMethodAnnotation {

	public String name();

	public String value();
}

// 字段注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyFieldAnnotation {

	public String name();

	public String value();
}

// 参数注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface MyParameterAnnotation {

	public String name();

	public String value();
}
