package com.zhuzi.camel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 使用spring 结合
 *
 * @author root
 */
public class App2 {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		context.start();
		boolean active = context.isActive();
		if (!active) {
			context.close();
		}
	}

}
