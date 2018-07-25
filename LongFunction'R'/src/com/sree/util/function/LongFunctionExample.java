package com.sree.util.function;

import java.util.function.LongFunction;

/**
 * @author Sridhar reddy
 *Accepts only long data type value and produces result of given data type. 
 */
public class LongFunctionExample {
	public static void main(String[] args) {
		LongFunction<String> ob = f -> String.valueOf(f * f);
		System.out.println(ob.apply(43));
	}
}