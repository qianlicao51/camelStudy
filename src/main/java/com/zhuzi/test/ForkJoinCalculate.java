package com.zhuzi.test;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 * RecursiveAction 没有返回值 RecursiveTask 有返回值
 * 
 * @author MI
 *
 */
public class ForkJoinCalculate extends RecursiveTask<Long> {
	
	

	@Override
	protected Long compute() {
		 
		return null;
	}

}
