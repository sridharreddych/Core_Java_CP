package com.sree.util.function;

import java.util.function.Function;

/**
 * @author Sridhar reddy Function<T,R> Function produces result of given data
 *         type and accepts one argument as given data type.
 */
public class FunctionExample {
	public static void main(String[] args) {
		Function<Integer, String> ob = f1 -> "Age:" + f1;
		System.out.println(ob.apply(20));
	}
}