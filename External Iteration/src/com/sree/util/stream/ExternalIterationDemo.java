package com.sree.util.stream;

import java.util.List;

/**
 * @author Sridhar reddy
 * 
 *         Java 8 has introduced internal iteration. forEach can iterate the
 *         collection internally. Before java 8, there was no such way to
 *         iterate list internally. To iterate the collection we need to use for
 *         loop or while loop. Using forEach, now iteration is possible in one
 *         line. To understand internal and external iteration, follow the below
 *         example.
 *
 *         External Iteration Suppose we have a list of employee and we need to
 *         update the salary of each and every employee multiplied by two. As
 *         old fashioned, we will do as below.
 */
public class ExternalIterationDemo {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();
		for (Employee e1 : list) {
			System.out.println("Salaray is" + e1.getSal() + "," + "Employee List " + e1.getEmpList());
		}
		for (Employee e : list) {
			e.setSal(e.getSal() * 2);
			System.out.println("Salaray is" + e.getSal() + "," + "Employee List " + e.getEmpList());

		}
	}
}