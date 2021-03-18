package com.home.java8.stream.one;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoOne {

	public static void intStream() {
		System.out.println("Demo ::::::: 1 2 3 4 ");

		IntStream.range(1, 5).forEach(x -> System.out.println(x));

		System.out.println("Demo ::::::: 1 2 3 4 5 ");
		IntStream.rangeClosed(1, 5).forEach(x -> System.out.println(x));

		System.out.println("Demo ::::::: 3 4 ");
		IntStream.range(1, 5).skip(2).forEach(x -> System.out.println(x));

		System.out.println("Demo ::::::: 10 ");
		int sum = IntStream.range(1, 5).sum();
		System.out.println(sum);

		System.out.println("Demo 4:::::::");
		OptionalInt min = IntStream.of(1, 2, 3, 4, 5).max();
		System.out.println(min);

		System.out.println("Demo ::::::: 20 ");
		IntStream even = IntStream.iterate(0, x -> x + 2).limit(5);
		System.out.println(even.sum());

		System.out.println("Demo ::::::: 5 ");
		IntStream odd = IntStream.iterate(0, x -> x % 2).limit(5);
		System.out.println(odd.count());

		System.out.println("Demo ::::::: 1 2 3 4 5 ");
		IntStream.of(1, 2, 3, 4, 5).boxed().collect(Collectors.toList()).forEach(x -> System.out.println(x));
		int[] array = IntStream.of(1, 2, 3, 4, 5).toArray();
		Arrays.stream(array).forEach(System.out::println);
		System.out.println("Demo ::::::: 1 2 3 4 5 ");
		List<Integer> arr = IntStream.of(1, 2, 3, 4, 5).boxed().collect(Collectors.toList());
		arr.forEach(System.out::println);

		System.out.println("Demo 8:::::::");
		System.out.println("Demo 9:::::::");
		System.out.println("Demo 10:::::::");

	}

}
