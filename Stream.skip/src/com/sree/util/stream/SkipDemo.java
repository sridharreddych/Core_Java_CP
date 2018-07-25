package com.sree.util.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sridhar reddy Stream.skip skip() is a method that skips given number
 *         of element from the stream object from start.
 */
public class SkipDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC", "DD");
		list.stream().skip(1).forEach(s -> System.out.println(s));
	}
}