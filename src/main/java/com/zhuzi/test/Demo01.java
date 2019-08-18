package com.zhuzi.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * java8 学习
 * 
 * @author MI
 *
 */
public class Demo01 {
	public static void main(String[] args) {

	}

	@Test
	public void testStram() throws Exception {
		List<Employee> list = Arrays.asList(new Employee(15, "name1"), new Employee(25, "name12"),
				new Employee(45, "name4"), new Employee(35, "name3"), new Employee(15, "name2"));

		System.out.println(list);

		// 获取age>35
		list.stream().filter((e) -> e.getAge() >= 35).limit(2).forEach(System.out::println);
		// .limit(2).forEach(System.out.println));

		list.stream().map(Employee::getName).forEach(System.out::println);
	}

	@Test
	public void testSort() throws Exception {

	}

}
