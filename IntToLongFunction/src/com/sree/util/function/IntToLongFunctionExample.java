package com.sree.util.function;

import java.util.function.IntToLongFunction;


/**
 * @author Sridhar reddy
 *IntToLongFunction
Accepts integer and produces long data type value. 
 */
public class IntToLongFunctionExample {
	public static void main(String[] args) {
		IntToLongFunction ob = f -> f * f;
		System.out.println(ob.applyAsLong(43));
	}
}