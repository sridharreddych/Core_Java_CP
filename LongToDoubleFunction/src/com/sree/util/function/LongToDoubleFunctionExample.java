package com.sree.util.function;

import java.util.function.LongToDoubleFunction;

/**
 * @author Sridhar reddy LongToDoubleFunction Accepts long data type value and
 *         produces double data type value.
 */
public class LongToDoubleFunctionExample {
	public static void main(String[] args) {
		
		LongToDoubleFunction ob = f -> f * f;
		System.out.println(ob.applyAsDouble(43));
	}
}