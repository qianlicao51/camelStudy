package com.zhuzi.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.zhuzi.camel.bus.bean.YmFam;

public class SendTcp {
	@Test
	public void testSend() throws IOException {

		JSONObject sendContext = new JSONObject();
		sendContext.put("nane", "grq");
		sendContext.put("age", 12);
		System.out.println(sendContext.toString());
		// sendContext.toJSONString(osendContextbject, filters, features)
		// alibaba.fastjson.JSON.toJSONString(object, filter, features)

		String object = sendContext.getString("name");
		// Object object = sendContext.get("mae");

		// System.out.println(object.toString());
		System.out.println(object);
		YmFam ymFam = new YmFam();
		ymFam.setAddid(null);
		System.out.println("---" + ymFam.toString());
		// System.out.println(tcpPost("182.168.0.176", 9020,
		// sendContext.toJSONString()));
		System.out.println("-------");
	}

	@SuppressWarnings("finally")
	public static String tcpPost(String ip, int port, String param) throws IOException {
		Socket socket = null;
		InputStream is = null;
		byte message[] = null;
		DataOutputStream dos = null;
		String s = "";
		try {
			socket = new Socket(ip, port);
			socket.setSoTimeout(100000);
			byte[] msg = param.getBytes("UTF-8");
			dos = new DataOutputStream(socket.getOutputStream());
			dos.write(msg);
			dos.flush();
			message = new byte[msg.length];
			// is = socket.getInputStream();
			// is.read(message);// 接收服务器的响应信息
			// System.out.println("返回的数据：");
			// s = new String(message);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接和I/O,释放资源
			is.close();
			dos.close();
			socket.close();
			return s;
		}
	}
}
