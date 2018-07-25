package com.sree.util.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sridhar reddy Stream.limit limit() method of stream API returns
 *         stream instance with the given number of element in limit as an
 *         argument. limit() method selects the elements from start. We need to
 *         pass a max value and it returns the stream up to the max number of
 *         elements.
 */
public class LimitDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC", "DD", "EE");
		list.stream().limit(3).forEach(s -> System.out.println(s));
	}
}