package com.zhuzi.camel.handler;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.http.common.HttpMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zhuzi.camel.utils.DownFile;

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
		// TODO 获取 request 和 response
		HttpServletRequest req = httpMessage.getRequest();
		HttpServletResponse response = httpMessage.getResponse();

		// TODO 这种方法获取 req resp 没获取到
		exchange.getIn().getBody(HttpServletRequest.class);
		exchange.getIn().getBody(HttpServletResponse.class);

		System.out.println(req == null);
		String path = "c:/1.jpg";
		Path paths = Paths.get(path);

		String fileName = "中文图片.jpg";
		DownFile.webDownFile(req, response, paths, fileName);
		log.info("http 服务");
	}

}
