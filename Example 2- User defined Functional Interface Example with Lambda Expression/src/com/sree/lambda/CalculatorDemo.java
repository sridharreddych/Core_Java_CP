package com.sree.lambda;

/**
 * @author Sridhar reddy
 *
 *         Find the main class how to use the functional interface using lambda
 *         expression.
 */
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator cal = (int a, int b) -> a + b;
		int res = cal.add(5, 6);
		System.out.println(res);
	}
}