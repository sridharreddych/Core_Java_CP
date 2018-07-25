package com.sree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sridhar reddy Stream.max() and Stream.min() max() method returns
 *         maximum element on the basis of given comparator. It returns Optional
 *         instance. min() method returns minimum element on the basis of given
 *         comparator. It returns Optional instance.
 */
public class StreamMaxMin {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("G", "B", "F", "E");
		String max = list.stream().max(Comparator.comparing(String::valueOf)).get();
		System.out.println("Max:" + max);
		String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
		System.out.println("Min:" + min);
	}
}