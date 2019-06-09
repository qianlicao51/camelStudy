package com.zhuzi.camel;

import org.apache.camel.spring.Main;

public class App3 {
	public static void main(String[] args) {
		try {
			Main main = new Main();
			String[] arg = new String[] { "-ac", "app.xml" };
			main.run(arg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
