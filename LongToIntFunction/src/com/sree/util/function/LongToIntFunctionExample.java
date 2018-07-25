package com.sree.util.function;

import java.util.function.LongToIntFunction;

/**
 * @author Sridhar reddy LongToIntFunction Accepts long data type value and
 *         produces integer data type value.
 */
public class LongToIntFunctionExample {
	public static void main(String[] args) {
		LongToIntFunction ob = f -> (int) (f * f);
		System.out.println(ob.applyAsInt(43));
	}
}