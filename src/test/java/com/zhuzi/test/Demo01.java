package com.zhuzi.test;

import java.io.IOException;

import com.zhuzi.camel.utils.TcpRequestUtils;

public class Demo01 {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i);
				String info = TcpRequestUtils.tcpPost("128.0.0.1", 8080, "");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
