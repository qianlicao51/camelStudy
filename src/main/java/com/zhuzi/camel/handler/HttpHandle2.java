package com.zhuzi.camel.handler;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.http.common.HttpMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 获取 HttpServletRequest https://www.cnblogs.com/mendeliang/p/5070835.html
 * 
 * @author root
 *
 */
@Component("httpHandle2")
public class HttpHandle2 implements Processor {
	private static Logger log = LoggerFactory.getLogger(MyTCPOrderHandler.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		HttpMessage httpMessage = exchange.getIn(HttpMessage.class);
		HttpServletRequest req = httpMessage.getRequest();
		HttpServletResponse response = httpMessage.getResponse();

		String fileName = "中文图片.jpg";
		ServletOutputStream out = response.getOutputStream();
		String filenamedisplay = java.net.URLEncoder.encode(fileName, StandardCharsets.UTF_8.name());
		if ("FF".equals(getBrowser(req))) {
			// 针对火狐浏览器处理方式不一样了
			filenamedisplay = new String(fileName.getBytes(StandardCharsets.UTF_8.name()), StandardCharsets.ISO_8859_1.name());
		}
		response.setHeader("Content-Disposition", "attachment;filename=" + filenamedisplay);
		// response.addHeader("Pargam", "no-cache");
		// response.addHeader("Cache-Control", "no-cache");

		String path = "c:/1.jpg";
		Path paths = Paths.get(path);
		if (Files.exists(paths)) {
			Files.copy(paths, out);// JDK自带的;缓存是8192
			// FileUtils.copyFile(paths.toFile(), outputStream);// 缓存是1024*4
		}

		log.info("http 服务");

	}

	private static String getBrowser(HttpServletRequest request) {
		String UserAgent = request.getHeader("USER-AGENT").toLowerCase();
		if (UserAgent != null) {
			if (UserAgent.indexOf("msie") >= 0) {
				return "IE";
			}

			if (UserAgent.indexOf("firefox") >= 0) {
				return "FF";
			}

			if (UserAgent.indexOf("safari") >= 0) {
				return "SF";
			}

			if (UserAgent.indexOf("mozilla") >= 0) {
				return "Chrome";
			}

		}
		return null;
	}

}
