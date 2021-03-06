package com.zhuzi.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.joda.time.DateTime;

import com.zhuzi.camel.utils.SendData;
import com.zhuzi.camel.utils.SysUtils;

/**
 * Apache Camel 学习
 * 
 * @author root
 *
 */
/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext(); // 1. 创建 CamelContext.
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from("timer://foo?fixedRate=true&period=1000").process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						SendData.sendDataByTcpRetulNull("192.168.226.1", 9020, SysUtils.getDate());
						exchange.getOut().setBody(new DateTime().toString("YYYY-MM-dd HH:mm:ss"));
					}
				}).to("stream:out"); // 2. 为路由配置组件或终端节点.
			}
		}); // 3. 添加路由到CamelContext
		context.setTracing(true);
		context.start(); // 4. 启动CamelContext.
		Thread.sleep(Integer.MAX_VALUE); // 为了保持CamelContext处于工作状态，这里需要sleep主线程
		context.stop();
		// 最后停止CamelContext
	}
}