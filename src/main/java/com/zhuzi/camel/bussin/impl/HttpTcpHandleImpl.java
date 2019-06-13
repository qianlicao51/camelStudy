package com.zhuzi.camel.bussin.impl;

import org.springframework.stereotype.Component;

import com.zhuzi.camel.bussin.IHttpHandle;
import com.zhuzi.camel.bussin.ITcpHandle;

@Component("httpTcpHandleImpl")
public class HttpTcpHandleImpl implements IHttpHandle, ITcpHandle {

	@Override
	public void handleTCP() throws Exception {
		System.out.println("HttpTcpHandleImpl.handleTCP()");
	}

	@Override
	public void handleHttp() throws Exception {

		System.out.println("HttpTcpHandleImpl.handleHttp()");
	}

}
