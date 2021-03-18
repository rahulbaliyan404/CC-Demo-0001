package com.home.java10;

public class Demo {

	public static void main(String[] args) {
		A b = new B();
		b.disp();
		b.doStuff();
	}

}

class A {

	public void disp() {
		System.out.println("This is Parent Disp method.");
	}

	public void doStuff() {
		System.out.println("This is Parent doStuff method.");
	}

}

class B extends A {

	public void disp() {
		System.out.println("This is Child Disp method.");
	}

	public void doMoreStuff() {
		System.out.println("This is Child doMoreStuff method.");
	}

}