package com.sree.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Sridhar reddy Supplier as an Argument with Stream API While using
 *         with Stream in java 8, we can pass Supplier as an augment to some of
 *         Stream methods. In the example we are calling Stream.map() in which
 *         we are passing Supplier instance.
 */
public class SupplierWithStream {
	public static void main(String[] args) {
		List<Item> list = new ArrayList<>();
		list.add(new Item("AA"));
		list.add(new Item("BB"));
		list.add(new Item("CC"));
		Stream<String> names = list.stream().map(Item::getName); // here i guess Item::getName as supplier instance
		names.forEach(n -> System.out.println(n));
	}
}