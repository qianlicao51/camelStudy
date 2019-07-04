package com.zhuzi.camel.utils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONObject;

public class TcpRequestUtils {

	private static Logger logger = LoggerFactory.getLogger(TcpRequestUtils.class); // 日志记录

	private static String ip = "";
	private static int port = 8080;
	private static int timeOut = 500;

	private static String ar_ip = "";
	private static int ar_port = 8080;

	/**
	 * tcpPost
	 * 
	 * @param param
	 *            参数
	 * @throws IOException
	 */
	@SuppressWarnings("finally")
	public static String tcpPost(JSONObject param) throws IOException {
		Socket socket = null;
		InputStream is = null;
		byte message[] = null;
		DataOutputStream dos = null;
		String s = "";
		try {
			String tradeMessage = param.toString();
			socket = new Socket(ip, port);
			socket.setSoTimeout(timeOut);
			byte[] msg = tradeMessage.getBytes("UTF-8");
			dos = new DataOutputStream(socket.getOutputStream());
			dos.write(msg);
			dos.flush();
			message = new byte[1024];
			is = socket.getInputStream();
			is.read(message);// 接收服务器的响应信息
			s = new String(message);
			// System.out.println("总线接收前置:++++++++"+s);
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

	// 总线发给前置指令
	public static void tcpPostReNull(JSONObject param) throws IOException {
		tcpPostReNull(ip, port, param.toString());
	}

	/**
	 * 阿日哈沙特LED发送
	 * 
	 * @param param
	 * @throws IOException
	 */
	public static void ArhstLedReNull(JSONObject param) throws IOException {
		Socket socket = null;
		DataOutputStream dos = null;
		try {
			String tradeMessage = param.toString();
			socket = new Socket(ar_ip, ar_port);
			socket.setSoTimeout(timeOut);
			byte[] msg = tradeMessage.getBytes("UTF-8");
			dos = new DataOutputStream(socket.getOutputStream());
			dos.write(msg);
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接和I/O,释放资源
			dos.close();
			socket.close();
		}
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
			socket.setSoTimeout(timeOut);
			byte[] msg = param.getBytes("UTF-8");
			dos = new DataOutputStream(socket.getOutputStream());
			dos.write(msg);
			dos.flush();
			message = new byte[128];
			is = socket.getInputStream();
			is.read(message);// 接收服务器的响应信息
			s = new String(message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接和I/O,释放资源
			IOUtils.closeQuietly(is);
			IOUtils.closeQuietly(dos);
			IOUtils.closeQuietly(socket);
			return s;
		}
	}

	public static void tcpPostReNull(String ip, int port, String param) throws IOException {
		Socket socket = null;
		DataOutputStream dos = null;
		try {
			socket = new Socket(ip, port);
			socket.setSoTimeout(timeOut);
			byte[] msg = param.getBytes("UTF-8");
			dos = new DataOutputStream(socket.getOutputStream());
			dos.write(msg);
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接和I/O,释放资源
			dos.close();
			socket.close();
		}
	}
}
