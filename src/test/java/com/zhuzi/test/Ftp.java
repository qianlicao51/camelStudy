package com.zhuzi.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.joda.time.DateTime;

import com.zhuzi.camel.utils.ConfigUtils;
import com.zhuzi.camel.utils.SysUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ftp {
	private static String hostname = "127.0.0.1";
	private static String username = "root";
	private static String pwd = "root";
	private static String ftpWorkPath = "pic/";

	public static void main(String[] args) throws IOException {
		String fileUrl = "https://i.muzishan.com/1411/2.jpg";
		fileUrl = "https://mtl.xtpxw.com/images/img/18858/2.jpg";
		String fileName = FilenameUtils.getName(fileUrl);

		File file = new File("d:/pic/" + SysUtils.getDateYmD() + "/" + fileName);
		FileUtils.copyURLToFile(new URL(fileUrl), file);

		upLoadFile(hostname, username, pwd, FileUtils.openInputStream(file), fileName, ftpWorkPath);

	}

	public static void upLoadFile(String hostname, String username, String password, FileInputStream fis,
			String fileName, String ftpWorkPath) {
		FTPClient ftpClient = new FTPClient();

		DateTime dTime = new DateTime();

		String ymd = dTime.toString(ConfigUtils.FORTER_DATE);

		try {

			ftpClient.connect(hostname, 21);
			ftpClient.login(username, password);
			
			System.out.println(ftpClient.getReplyCode());

			// 设置上传目录
			String fileDir = "/" + ftpWorkPath + ymd+"/";
			log.info(fileDir);
			System.out.println(fileDir);
			
			ftpClient.changeWorkingDirectory(fileDir);
			ftpClient.setBufferSize(1024);
			ftpClient.setControlEncoding("UTF-8");

			// 设置为被动模式
			ftpClient.enterLocalPassiveMode();

			// 设置文件类型（二进制）
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			ftpClient.storeFile(fileName, fis);

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("FTP客户端出错！", e);
		} finally {
			IOUtils.closeQuietly(fis);
			try {
				ftpClient.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("关闭FTP连接发生异常！", e);
			}
			log.info("已上传至FTP服务器路径！");
		}
	}
}
