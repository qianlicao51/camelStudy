package com.zhuzi.camel.process;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zhuzi.camel.utils.SysUtils;

@Component("tcpReviveProcessEnd")
public class TcpReviveProcessEnd implements Processor {
	private static Logger log = LoggerFactory.getLogger(TcpReviveProcessEnd.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		Message in = exchange.getIn();
		String body = in.getBody(String.class);
		log.info(" 第二个切面收到 的是{}", body);
		// TODO 关于输出，存在 exchange.getOut() 使用此输出，不存在此项 会使用 in 输出
		exchange.getOut().setBody("dela end 2");
		in.setBody("deal end" + SysUtils.getDate());

	}

}
