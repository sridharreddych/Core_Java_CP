package com.sree.util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sridhar reddy
 *Collectors.collectingAndThen
Collectors.collectingAndThen accepts a collection and a function. In our example first we are calculating average by a calculator and then multiplying to itself by a function.
 */
public class CollectingAndThenExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4); //1,4,6,8  ,1,16,36,64
		Double result = list.stream()
				.collect(Collectors.collectingAndThen(Collectors.averagingLong(v -> v * 2), s -> s * s));
		System.out.println(result);
	}
}