package com.zhuzi.camel.utils;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;
import org.apache.ibatis.io.Resources;

public class SendMail {
	public static void sendMail() throws Exception {
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.163.com");
		email.setSmtpPort(465);
		// 用户名和密码为邮箱的账号和密码（不需要进行base64编码）
		email.setAuthenticator(new DefaultAuthenticator("", ""));
		email.setSSLOnConnect(true);
		email.setFrom("***@163.com");
		email.setSubject("TestMail online PIC");
		email.setCharset(StandardCharsets.UTF_8.name());
		email.addTo("**********@163.com");

		// 内嵌图片
		StringBuilder sBuilder = new StringBuilder("<font color='blue'>This is a test mail ... :-)</font>");
		File picFile = Resources.getResourceAsFile("pic");
		Collection<File> listFiles = FileUtils.listFiles(picFile, null, true);
		for (File file : listFiles) {
			// TODO 位置1 和位置2 要设置为一致
			// TODO 位置1
			email.embed(file, file.getName());
			// common-io 工具包判断文件 是否 是图片后缀
			if (FilenameUtils.isExtension(file.getName(), Arrays.asList("jpg", "png", "gif"))) {
				// TODO 位置2 如果没有 <img src='cid 则作为附件发送
				sBuilder.append("<img src='cid:" + file.getName() + "' />");
			}
		}
		email.setHtmlMsg(sBuilder.toString());
		email.send();
	}

	public static void main(String[] args) throws Exception {
		sendMail();
	}
}
