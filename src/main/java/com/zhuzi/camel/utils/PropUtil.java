package com.zhuzi.camel.utils;

import java.io.IOException;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

public class PropUtil {

	private static String MAIL_PROP = "prop/mail.properties";

	public static String getMailKey(String key) {

		return getPropFile(MAIL_PROP).getProperty(key);

	}

	private static Properties getPropFile(String path) {
		try {
			return Resources.getResourceAsProperties(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

}
