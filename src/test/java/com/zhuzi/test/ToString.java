package com.zhuzi.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import com.zhuzi.camel.bus.bean.YmFam;

public class ToString {

	@Test
	public void test() throws MalformedURLException, IOException {

		FileUtils.copyURLToFile(new URL("http://apache.org/img/support-apache.jpg"), new File("d://1212.jpg"));
		
		YmFam ymFam = new YmFam();

		ymFam.setAddid("zhuzi");
		ymFam.setId(1);
		ymFam.setBirthn(120);
		ymFam.setBirthg(150);
		String s = new ToStringBuilder(ymFam).append("id").append("name").append("createtime").toString();
		System.out.println(ToStringBuilder.reflectionToString(ymFam));
		System.out.println(ymFam.toString());

	}

	@Test
	public void t2() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("names", "grq");
		jsonObject.put("AGE", "12");
		String object = (String) jsonObject.get("name");
		System.out.println(object);
		System.out.println((String) jsonObject.get("name"));
		System.out.println((Integer) jsonObject.get("AGE"));
		System.out.println("------");
	}

	@Test
	public void t3() throws IOException {
		InputStream  in  = null;
		in.close();
	}
}
