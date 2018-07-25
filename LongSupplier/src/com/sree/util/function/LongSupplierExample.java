package com.sree.util.function;

import java.util.function.LongSupplier;

/**
 * @author Sridhar reddy LongSupplier java.util.function.LongSupplier is a
 *         functional interface that can be used as a Supplier for long values.
 *         LongSupplier always returns long data type value by the method
 *         getAsLong().
 */
public class LongSupplierExample {
	public static void main(String[] args) {
		Item item = new Item(true, 123);
		LongSupplier ls = item::getVal;
		System.out.println("Long Value:" + ls.getAsLong());
	}
}