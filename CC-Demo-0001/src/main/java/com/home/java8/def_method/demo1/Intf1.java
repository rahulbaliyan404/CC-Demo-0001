package com.home.java8.def_method.demo1;

public interface Intf1 {

	default void m1() {
		System.out.println("This is intf1 m1() method. ");
	}

	default void m2() {
		System.out.println("This is intf1 m2() method. ");
	}

}
