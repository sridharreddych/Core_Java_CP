package com.sree.util;

import java.util.function.Supplier;

/**
 * @author Sridhar reddy java.util.function.Supplier is a functional interface
 *         in java 8. Supplier can be assigned in lambda expression. Supplier
 *         can be passed as an argument to different methods in java 8. Supplier
 *         has a functional method get(). Supplier and Consumer can be used to
 *         implement producer and consumer. In our example we will describe how
 *         to create and use Supplier in our programming. Find a class which
 *         will store values and will be used in our Supplier Example.
 * 
 *         Supplier to return Object of a Class Supplier can create the object
 *         of a class. Pass class name and new keyword while creating supplier.
 *         Call Supplier.get() and we will get object of that class.
 */
public class SupplierReturnObject {
	public static void main(String[] args) {
		Supplier<Item> supplier = Item::new;
		Item item = supplier.get(); //Call Supplier.get() and we will get object of that class. 
		System.out.println(item.getMsg());
	}
}