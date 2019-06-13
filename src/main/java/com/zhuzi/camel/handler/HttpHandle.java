package com.zhuzi.camel.handler;

import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.http.common.HttpMessage;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zhuzi.camel.base.SpringContextUtil;
import com.zhuzi.camel.bussin.IHttpHandle;
import com.zhuzi.camel.bussin.ITcpHandle;

/**
 * 获取 HttpServletRequest https://www.cnblogs.com/mendeliang/p/5070835.html
 * 
 * @author root
 *
 */
@Component("httpHandle")
public class HttpHandle implements Processor {
	private static Logger log = LoggerFactory.getLogger(MyTCPOrderHandler.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		// /////////////////////////////////
		IHttpHandle handle_HTTP = (IHttpHandle) SpringContextUtil.getBean("httpTcpHandleImpl");
		handle_HTTP.handleHttp();
		ITcpHandle handle_TCP = (ITcpHandle) SpringContextUtil.getBean("httpTcpHandleImpl");
		handle_TCP.handleTCP();
		// /////////////////////////////////
		HttpMessage httpMessage = exchange.getIn(HttpMessage.class);
		HttpServletRequest req = httpMessage.getRequest();
		log.info("http 请求{}", req.getRequestURI());

		String parameter = req.getParameter("data");
		System.out.println(parameter);

		Message in = exchange.getIn();
		String headbody = in.getBody(String.class);
		System.out.println(headbody);
		// exchange.getOut().removeHeaders("CamelHttp*"); //在process中也可以去掉
		exchange.getOut().setHeader(Exchange.HTTP_METHOD, "POST"); // 指定请求的方式
		exchange.getOut().setBody("names");// camle 在路由时去掉了body参数，所以需要手动添加
		// exchng.getOut().setHeader(Exchange.HTTP_QUERY,
		// "hl=en&test=activemq"); //指定请求参数
		// exchng.getOut().setBody("example.json-String.with中文。"); //重新设置body参数

		HttpServletResponse response = httpMessage.getResponse();
		String fileName = "c:/1.jpg";
		ServletOutputStream out = response.getOutputStream();
		FileUtils.copyFile(Paths.get(fileName).toFile(), out);
	}

}
