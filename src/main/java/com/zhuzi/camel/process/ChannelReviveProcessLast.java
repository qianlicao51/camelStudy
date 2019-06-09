package com.zhuzi.camel.process;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zhuzi.camel.base.SpringContextUtil;
import com.zhuzi.camel.bus.bean.YmFam;
import com.zhuzi.camel.bus.service.YmFamService;
import com.zhuzi.camel.utils.SysUtils;

@Component("channelReviveProcessLast")
public class ChannelReviveProcessLast implements Processor {

	private static Logger log = LoggerFactory.getLogger(ChannelReviveProcessLast.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);

		YmFamService ymFamService = (YmFamService) SpringContextUtil.getBean("ymFamService");

		List<YmFam> all = ymFamService.getAll();
		for (YmFam ymFam : all) {
			System.out.println(ymFam.toString());

		}
		System.out.println(SysUtils.getDate() + "|" + body);
		log.info("channelReviveProcessLast 数据切面接受到的数据{}|{}", SysUtils.getDate(), body);
		exchange.getOut().setBody(SysUtils.getDate());

	}

}
