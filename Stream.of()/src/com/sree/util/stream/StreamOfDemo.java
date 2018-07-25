package com.sree.util.stream;

import java.util.stream.Stream;

/**
 * @author Sridhar reddy Stream.of() Stream.of() is a method which returns
 *         sequential ordered stream. We can pass any number of elements comma
 *         separated and will get stream instance.
 */
public class StreamOfDemo {
	public static void main(String[] args) {
		Stream.of("Ram", "Shyam", "Mohan").forEach(s -> System.out.println(s));
	}
}