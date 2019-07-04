package com.zhuzi.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.zhuzi.camel.utils.SysUtils;

public class JsoupTest {

	@Test
	public void testName() throws Exception {
		StringUtils.isNotBlank("");
		StringUtils.isNoneBlank("");
		System.out.println(null+"12");
	}

	@org.junit.Test
	public void dwon() throws MalformedURLException, IOException {
		FileUtils.copyURLToFile(new URL("http://127.0.0.1:8080/app/1.jpg"), new File("d:/pic/" + SysUtils.getDateYmd() + ".jpg"));
	}

	@Test
	public void dwons() throws MalformedURLException, IOException {
		FileUtils.copyURLToFile(new URL("http://127.0.0.1/myapp/1.jpg"), new File("d:/pic/" + SysUtils.getDateYmd() + ".jpg"));
	}
}
