package com.java.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 泛型 泛型在运行期间不知道类型，泛型的实例在运行期间可以直到类型
 *
 * @param <T>
 */
public class GenericityTest<T> {

	private List<T> list;

	public void setList(List<T> list) {
		this.list = list;
	}

	private void test() throws Exception {
		Method setListMethod = GenericityTest.class.getDeclaredMethod("setList", List.class);
	}

	public List<T> getList() {
		return list;
	}

	public static void main(String[] args) throws Exception {

		GenericityTest<?> genericityTest = GenericityTest.class.getConstructor().newInstance();

		List<String> resList = Arrays.asList(new String[] { "1", "2", "3" });

		Method setListMethod = GenericityTest.class.getDeclaredMethod("setList", List.class);

		setListMethod.invoke(genericityTest, resList);

		Method getListMethod = GenericityTest.class.getDeclaredMethod("getList");

		Object object = getListMethod.invoke(genericityTest);

		if (object instanceof List) {
			List<String> list = (List<String>) object;
			for (String string : list) {
				System.out.println(string);
			}
		}

		Type returnType = getListMethod.getGenericReturnType();

		if (returnType instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) returnType;
			Type[] arguments = parameterizedType.getActualTypeArguments();
			for (Type type : arguments) {
				// Class<?> typeClass = (Class<?>) type;
				System.out.println(type);
			}
		}

	}
}
