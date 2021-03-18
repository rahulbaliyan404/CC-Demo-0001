package com.home.java8.demo;

import java.util.Comparator;

public class Demo {

}

class Mycomprator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return +1;
		}

		return 0;
	}

}
