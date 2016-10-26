package com.dynamic.zhihu;

import java.util.HashMap;
import java.util.Map;

/**
 * »º´æ
 */
public class CacheFontProvider implements FontProvider {

	private FontProvider fontProvider; // ÔÞ
	private Map<String, Font> cached;

	public CacheFontProvider(FontProvider fontProvider) {
		this.fontProvider = fontProvider;
		this.cached = new HashMap<>();
	}

	@Override
	public Font getFont(String name) {
		Font font = cached.get(name);
		if (font == null) {
			font = fontProvider.getFont(name);
			cached.put(name, font);
		} else {
			System.out.println("Cached");
		}
		return font;
	}
}
