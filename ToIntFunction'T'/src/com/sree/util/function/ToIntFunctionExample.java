package com.sree.util.function;

import java.util.function.ToIntFunction;

/**
 * @author Sridhar reddy ToIntFunction<T> Accepts an argument of given data type
 *         and produces integer value.
 * 
 */
public class ToIntFunctionExample {
	public static void main(String[] args) {
		ToIntFunction<Integer> ob = f -> f * 123;
		System.out.println(ob.applyAsInt(306));
	}
}