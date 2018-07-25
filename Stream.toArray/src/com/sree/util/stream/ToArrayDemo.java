package com.sree.util.stream;

import java.util.stream.Stream;

/**
 * @author Sridhar reddy Stream.toArray toArray() method converts a stream into
 *         an array.
 */
public class ToArrayDemo {
	public static void main(String[] args) {
		Object[] ob = Stream.of("A", "B", "C", "D").toArray();
		for (Object o : ob) {
			System.out.println(o.toString());
		}
	}
}