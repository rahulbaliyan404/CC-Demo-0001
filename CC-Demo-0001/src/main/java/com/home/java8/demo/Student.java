package com.home.java8.demo;

public class Student implements Comparable<Student> {

	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks > o.marks)
			return 1;
		else if (this.marks < o.marks)
			return -1;

		return o.name.compareTo(o.name);

	}

	@Override
	public String toString() {
		return "Name : " + name + " Marks : " + marks;
	}

}
