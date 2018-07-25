package com.sree.util.stream;

import java.util.List;

/**
 * @author Sridhar reddy
 *
 *         Internal Iteration Now the same task we will do in new fashion using
 *         forEach that will iterate collection internally. Find the code below.
 */
public class InternalIterationDemo {
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();
		System.out.println("Salary before update");
		list.forEach(e -> System.out.print(e.getSal() + "  "));
		list.forEach(e -> e.setSal(e.getSal() * 2));
		System.out.println("\nSalary after update");
		list.forEach(e -> System.out.print(e.getSal() + "  "));
	}
}