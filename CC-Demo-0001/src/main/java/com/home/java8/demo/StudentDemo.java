package com.home.java8.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
		al.add(new Student("Rahul", 25));
		al.add(new Student("Rohit", 25));
		al.add(new Student("Amit", 40));
		al.add(new Student("Punit", 35));
		al.add(new Student("Baliyan", 35));

		Collections.sort(al);
		al.forEach(System.out::println);
		System.out.println("-------------------------------------------");
		Collections.sort(al, new MyClass());
		al.forEach(System.out::println);
	}

}

class MyClass implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o2.marks - o1.marks == -1) {
			return -1;
		} else if (o2.marks - o1.marks == 1) {
			return 1;
		} else if (o2.marks - o1.marks == 0) {
			return 0;
		}

		return o1.name.compareTo(o2.name);
	}
}