package com.zhuzi.data;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.boot.SpringApplication;

/**
 * https://www.bilibili.com/video/av54029771?from=search&seid=8826386907867486489
 * https://www.bilibili.com/video/av54029771/?p=7
 * <p>
 * java数据结构与算法
 * </p>
 * 
 * @author MI
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		// 稀疏数组

		int chaesArr[][] = new int[11][11];
		chaesArr[1][2] = 1;
		chaesArr[2][4] = 2;
		for (int[] is : chaesArr) {
			for (int is2 : is) {
				System.out.printf("%d\t", is2);
			}
			System.out.println();
		}
		//
		System.out.println("原始数组");

		int sum = 0;
		for (int[] is : chaesArr) {
			for (int is2 : is) {
				if (is[is2] == 0) {

				} else {
					sum++;
				}
			}

		}

		System.out.println(sum);

	}

	@Test
	public void testName() throws Exception {

	}

}
