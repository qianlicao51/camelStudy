package com.zhuzi.camel.handler;

import javax.annotation.Resource;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zhuzi.camel.bus.service.YmFamService;
import com.zhuzi.camel.utils.PropertiesUtil;
/**
 * spring 读取配置文件的方式
 * @author root
 *
 */
@Component("propGetHandle")
public class PropGetHandle {
	private static Logger log = LoggerFactory.getLogger(PropGetHandle.class);
	@Resource
	YmFamService ymFamService;

	@Value("${channel.server.port}")
	private String port;
	
	@Autowired
    PropertiesUtil propUtil;

	@Handler
	public void hadler(Exchange exchange) {
		log.info("url ->{} | port->{}", propUtil.getUrl(), port);

	}

}
