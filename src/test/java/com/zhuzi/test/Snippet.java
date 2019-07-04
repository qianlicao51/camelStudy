package com.zhuzi.test;

import java.util.ArrayList;
import java.util.List;

public class Snippet {
	public static void main(String[] args) {

		List<Integer> calc = getNumNew(12);
		System.out.println("-------");
		System.out.println(calc.toString());

	}

	public static List<Integer> getNumNew(Integer kill) {
		Integer[] keys = { 1, 2, 4, 8, 16 };
		int n = keys.length;
		int nbit = 1 << n;
		Integer in;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nbit; i++) {
			in = 0;
			list.clear();
			for (int j = 0; j < n; j++) {
				int tmp = 1 << j; // 由0到n右移位
				if ((tmp & i) != 0) { // 与运算，同为1时才会是1
					in += keys[j];
					list.add(keys[j]);
				}
			}
			if (in == kill)
				return list;
		}
		System.err.println(list);
		return list;
	}
}
