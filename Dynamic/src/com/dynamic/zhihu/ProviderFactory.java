package com.dynamic.zhihu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * 动态代理配合工厂模式适用
 *
 */

public class ProviderFactory {

	public static FontProvider getFontProvider() {

		// 1.动态代理
		Class<FontProvider> targetClass = FontProvider.class;

		return (FontProvider) Proxy.newProxyInstance(targetClass.getClassLoader(), new Class[] { targetClass },
				new CacheProviderHandler(new FontProviderFromDisk()));

		// 2.静态代理
		// return new CacheFontProvider(new FontProviderFromDisk());
	}

	public static void main(String[] args) {
		FontProvider fontProvider = ProviderFactory.getFontProvider();
		Font font = fontProvider.getFont("微软雅黑");

		System.out.println(font.name);

		Font font2 = fontProvider.getFont("微软雅黑");

		System.out.println(font2.name);
	}
}
