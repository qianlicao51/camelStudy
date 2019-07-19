package com.zhuzi.xml;

import java.util.List;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.tree.DefaultExpressionEngine;
import org.apache.commons.configuration2.tree.DefaultExpressionEngineSymbols;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

public class Demo01 {
	private static Logger log = LoggerFactory.getLogger(Demo01.class);

	public static XMLConfiguration execute(String xmlPath) {
		XMLConfiguration config = null;
		try {
			Configurations configs = new Configurations();
			config = configs.xml(xmlPath);
			{
				// 使用默认的符号定义创建一个表达式引擎
				DefaultExpressionEngine engine = new DefaultExpressionEngine(
						DefaultExpressionEngineSymbols.DEFAULT_SYMBOLS);
				// 指定表达式引擎
				config.setExpressionEngine(engine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return config;
	}

	public static void main(String[] args) throws ConfigurationException {
		System.out.println("Demo01.testname()");

		Configurations configs = new Configurations();
		XMLConfiguration xml = configs.xml("D:\\soft\\wk\\eclipsewk\\camelStudy\\src\\main\\resources\\xml\\demo01.xml");

  List<Object> list = xml.getList("*");

		List<String> paths = xml.getList(String.class, "processing.paths.path");
		System.out.println(list);
	}

	@Test
	public void testname() throws Exception {
		System.out.println("Demo01.testname()");

		Configurations configs = new Configurations();
		XMLConfiguration xml = configs
				.xml("D:\\soft\\wk\\eclipsewk\\camelStudy\\src\\main\\resources\\xml\\demo01.xml");

		String string = xml.getString("//*[@stage='qa']");

		List<String> paths = xml.getList(String.class, "processing.paths.path");
		System.out.println(string);
		for (String str : paths) {
			// System.out.println(str);

		}

	}

}
