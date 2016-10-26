package com.dynamic.zhihu;

public class FontProviderFromDisk implements FontProvider {

	@Override
	public Font getFont(String name) {
		return new Font("DISK");
	}
}
