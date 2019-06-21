package com.zhuzi.camel.utils;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.ibatis.io.Resources;

public class SendMail {
	public static void sendMail() throws Exception {
		HtmlEmail email = new HtmlEmail();
		email.setDebug(true);
		email.setHostName(PropUtil.getMailKey("send.hostname"));
		email.setSmtpPort(465);
		// 用户名和密码为邮箱的账号和密码（不需要进行base64编码）
		email.setAuthenticator(new DefaultAuthenticator(PropUtil.getMailKey("send.user"), PropUtil.getMailKey("send.pwd")));
		email.setSSLOnConnect(false);
		String nick = javax.mail.internet.MimeUtility.encodeText("我的昵称");
		email.setFrom(PropUtil.getMailKey("send.user"), "zhuzi");
		email.setSSLOnConnect(true);

		email.setSubject("TestMail online PIC");
		email.setCharset(StandardCharsets.UTF_8.name());
		email.addTo("1792443323@qq.com", "千里草javasend");// 邮箱和别名
		email.addTo("qianlicaozhu@163.com", "千里草javasend");// 邮箱和别名

		// 内嵌图片
		StringBuilder sBuilder = new StringBuilder("<font color='blue'>This is a test mail ... :-)</font>");
		File picFile = Resources.getResourceAsFile("attachment");
		Collection<File> listFiles = FileUtils.listFiles(picFile, null, true);
		for (File file : listFiles) {
			// TODO 位置1 和位置2 要设置为一致
			// TODO 位置1
			email.embed(file, file.getName());
			// common-io 工具包判断文件 是否 是图片后缀
			if (FilenameUtils.isExtension(file.getName(), Arrays.asList("jpg", "png", "gif"))) {
				// TODO 位置2 如果没有 <img src='cid 则作为附件发送
				sBuilder.append("<a href='https://www.baidu.com' target='_blank' ><img src='cid:" + file.getName() + "' /></a>");
			}
		}
		email.setHtmlMsg(sBuilder.toString());

		// 在线资源
		/*
		 * EmailAttachment attachment = new EmailAttachment();
		 * attachment.setURL(new
		 * URL("http://www.apache.org/images/asf_logo_wide.gif"));
		 * attachment.setDisposition(EmailAttachment.ATTACHMENT);
		 * attachment.setDescription("Apache logo"); attachment.setName(
		 * "Apache logo"); email.attach(attachment);
		 */

		email.send();
	}

	public static void main(String[] args) throws Exception {
		sendMail();
	}
}
