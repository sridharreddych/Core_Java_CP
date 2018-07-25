package com.sree.util.function;

import java.util.function.IntToDoubleFunction;

/**
 * @author Sridhar reddy
 *IntToDoubleFunction
Accepts integer value and produces double data type value. 
 */
public class IntToDoubleFunctionExample {
	public static void main(String[] args) {
		IntToDoubleFunction ob = f -> f * f;
		System.out.println(ob.applyAsDouble(43));
	}
}