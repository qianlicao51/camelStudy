package com.zhuzi.camel;

import org.apache.camel.spring.Main;

import com.zhuzi.camel.utils.PropUtil;

public class App3 {

	public static void main(String[] args) {
		try {
			System.out.println();
			PropUtil.getMailKey("send.hostname");
			Main main = new Main();
			String[] arg = new String[] { "-ac", "app.xml" };
			main.run(arg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
