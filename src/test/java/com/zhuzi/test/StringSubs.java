package com.zhuzi.test;

import org.apache.commons.lang3.StringUtils;

public class StringSubs {
	public static void main(String[] args) {
		String str = " 00071C3400300833B2DDD9014000000000C41EE2801105200078922F4B097F0C840236";
		// System.out.println(str.substring(38,99));
		String[] split = StringUtils.split(str, "0007");
		for (String string : split) {
			System.out.println(string);
		}

	}
}
