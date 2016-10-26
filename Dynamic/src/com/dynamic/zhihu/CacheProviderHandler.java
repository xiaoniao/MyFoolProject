package com.dynamic.zhihu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CacheProviderHandler implements InvocationHandler {

	private Map<String, Object> cached = new HashMap<>();
	private Object object;

	public CacheProviderHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Type[] types = method.getTypeParameters();
		if (method.getName().matches("get.+") && types.length == 1 && types[0] == String.class) {
			String key = (String) args[0];
			Object cache = cached.get(key);
			if (cache == null) {
				cache = method.invoke(object, args);
				cached.put(key, cache);
			}
			return cache;
		}

		return method.invoke(object, args);
	}

}
