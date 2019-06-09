package com.zhuzi.camel.handler;

import javax.annotation.Resource;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zhuzi.camel.bus.bean.YmFam;
import com.zhuzi.camel.bus.service.YmFamService;

@Component("myTCPOrderHandler")
public class MyTCPOrderHandler {

	private static Logger log = LoggerFactory.getLogger(MyTCPOrderHandler.class);
	@Resource
	YmFamService ymFamService;

	@Handler
	public void hadler(Exchange exchange) {
		String body = exchange.getIn().getBody(String.class);
		log.info("接受到的信息是-->{}", body);
		log.info("接受到的信息长度是-->{}", body.getBytes().length);
		YmFam ymFam = ymFamService.getById(8);
		System.out.println(new ToStringBuilder(ymFam).append("id").append("name").append("createtime"));
		log.info("回复的内容-->{}",ToStringBuilder.reflectionToString(ymFam));
		exchange.getOut().setBody(ToStringBuilder.reflectionToString(ymFam).toString());

	}
}
