package com.sree.util.stream;

/**
 * @author Sridhar reddy
 *
 *         Find the Employee class which is being used as value object.
 */
public class Employee {
	public int id;
	public String name;
	public int sal;

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
}