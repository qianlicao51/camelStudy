package com.zhuzi.camel.handler;

import javax.annotation.Resource;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Message;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zhuzi.camel.base.SpringContextUtil;
import com.zhuzi.camel.bus.bean.YmFam;
import com.zhuzi.camel.bus.service.YmFamService;
import com.zhuzi.camel.utils.SysUtils;

@Component("myTCPOrderHandler2")
public class MyTCPOrderHandler2 {

	private static Logger log = LoggerFactory.getLogger(MyTCPOrderHandler2.class);
	@Resource
	YmFamService ymFamService;

	@Handler
	public void hadler(Exchange exchange) {
		Message in = exchange.getIn();
		
		//接收到的数据IP
		Object header = in.getHeader("CamelMina2RemoteAddress");
		System.out.println(header.toString());
		
		
		String body = exchange.getIn().getBody(String.class);
		String exchangeId = exchange.getExchangeId();
		System.out.println(exchangeId);
		YmFamService ymFamService = (YmFamService) SpringContextUtil.getBean("ymFamService");
		log.info("接受到的信息是-->{}", body);
		// YmFam ymFam = ymFamService.getById(8);
		// ToStringBuilder append = new
		// ToStringBuilder(ymFam).append("id").append("name").append("createtime");
		// System.out.println(append.toString());
		// System.out.println(ymFam.toString());

		// 真正发送到的是 “3” “2”不会发送 “1” 会被覆盖
		exchange.getOut().setBody(SysUtils.getDate() + ">1");
		exchange.getOut().setBody(SysUtils.getDate() + ">3");
		in.setBody(SysUtils.getDate() + "2");
	}
}
