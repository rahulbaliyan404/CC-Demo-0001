package com.home.java8.stream.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.IntStream;

public class DemoTwo {

	public static void main(String[] args) {

		List<Integer> c = Arrays.asList(10, 15, 30, 20, 25);
		c.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out:: println);
		
		
		//c.stream().sorted().collect(Collectors.toList()).forEach(System.out:: println);

		// long s = c.stream().count();
		// System.out.println(s);

		// c.stream().limit(2).forEach(System.out::println);

		// IntStream.of(10, 34, 17, 30, 40, 56).sorted().forEach(System.out::println);

	}

}
