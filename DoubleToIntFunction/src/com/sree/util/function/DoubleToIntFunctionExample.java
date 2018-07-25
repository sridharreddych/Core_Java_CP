package com.sree.util.function;

import java.util.function.DoubleToIntFunction;

/**
 * @author Sridhar reddy DoubleToIntFunction Accepts double data type value and
 *         returns integer value.
 */
class DoubleToIntFunctionExample {
	public static void main(String[] args) {
		DoubleToIntFunction ob = f -> new Double(f * 4.8).intValue();
		System.out.println(ob.applyAsInt(43.7));
	}
}