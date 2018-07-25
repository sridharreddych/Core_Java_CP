package com.sree.util.function;

import java.util.function.IntSupplier;

/**
 * @author Sridhar reddy
 *IntSupplier
java.util.function.IntSupplier is a functional interface that can be used as a Supplier for integer
 values. IntSupplier always returns integer value by the method getAsInt()
 */
public class IntSupplierExample {
	public static void main(String[] args) {
		Item item = new Item(true, 123);
		IntSupplier is = item::getVal;
		System.out.println("Int Value:" + is.getAsInt());
	}
}