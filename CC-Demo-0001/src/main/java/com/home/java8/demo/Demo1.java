package com.home.java8.demo;

import java.util.Arrays;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		
		Collections.sort(Arrays.asList(10,20,15,18,25,50,40),new Mycomprator());
		
	}

}
