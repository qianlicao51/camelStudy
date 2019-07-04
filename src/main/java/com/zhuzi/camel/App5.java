package com.zhuzi.camel;

import com.zhuzi.camel.utils.PropUtil;

public class App5 {
	public static void main(String[] args) {
		try {
			String mailKey = PropUtil.getMailKey("send.hostname");
			System.out.println(mailKey);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
