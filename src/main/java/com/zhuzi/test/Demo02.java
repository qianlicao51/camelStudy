package com.zhuzi.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class Demo02 {
	List<Employee> listsEmployees = Arrays.asList(new Employee(15, "name1"), new Employee(25, "name12"),
			new Employee(45, "name4"), new Employee(35, "name3"), new Employee(15, "name2"));

	@Test
	public void testStream() throws Exception {
		/*
		 * Stream流操作 <p> 1 创建stream </p><p> 2 中间操作 </p> <p>3 终止操作|终端操作
		 * 
		 * 
		 */

		// Arrays.stream(array)
//		list.stream();//集合创建流
//		通过 stram of方法
		Stream.of("a", "b", "c");

		// 创建无限流(迭代) |起始值
		Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2).limit(10);
		iterate.forEach(System.out::println);

//		生成
		Stream.generate(() -> Math.random());
	}

	@Test
	public void streamOPP() throws Exception {
		// 跳过前面3个 |skip >|distinct 方法必须重写hashcode equals
		Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 1).limit(10).skip(3).distinct();
		iterate.forEach(System.out::println);
		listsEmployees.stream().filter((e) -> e.getAge() >= 35);

		List<String> list = Arrays.asList("ddd", "aaa", "bbb", "ccc", "aaa");
		System.out.println(list);

		// map
		list.stream().map((str) -> (str.toUpperCase())).forEach(System.out::println);

		listsEmployees.stream().sorted((a, b) -> {
			return b.getAge() - a.getAge();// 倒叙

		}).forEach(System.out::println);
		double sum = Double.sum(1, 1);
		System.out.println(sum);

		System.out.println("$-------------------------------------$");
		List<String> collect = list.stream().collect(Collectors.toList());
		System.out.println(collect);
		collect.add("ada");
		System.out.println(collect);

//		收集到hashset中
		list.stream().collect(Collectors.toCollection(HashSet::new));

	}

	@Test
	public void testGroupby() throws Exception {
		// 分组
		Map<Integer, List<Employee>> collect = listsEmployees.stream()
				.collect(Collectors.groupingBy((e) -> e.getName().length()));
		System.out.println(collect);
	}

	@Test
	public void testName() throws Exception {
		Integer[] ingIntegers = { 1, 2, 3, 4, 5 };
		Arrays.asList(ingIntegers).stream().map((a) -> a * a).forEach(System.out::println);

	}
}
