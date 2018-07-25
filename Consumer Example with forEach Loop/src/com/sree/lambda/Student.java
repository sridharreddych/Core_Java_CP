package com.sree.lambda;

/**
 * @author Sridhar reddy
 *
 *         Student class defines printData() method that is used with forEach
 *         loop.
 */
public class Student {
	public String name;
	public int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printData() {
		System.out.println("Name:" + name + " age:" + age);
	}
}