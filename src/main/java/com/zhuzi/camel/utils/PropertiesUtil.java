package com.zhuzi.camel.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("propertiesUtil")
public class PropertiesUtil {
	@Value("${channel.server.port}")
	private String port;
	@Value("${jdbc.url}")
	private String url;

	
	
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
