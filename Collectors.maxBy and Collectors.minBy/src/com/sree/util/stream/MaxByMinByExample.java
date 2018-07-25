package com.sree.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Sridhar reddy
 *Collectors.maxBy and Collectors.minBy
Collectors.maxBy collects maximum element in stream for a given comparator. Collectors.minBy collects minimum element of a stream for a given comparator. 
 */
public class MaxByMinByExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30, 10, 20, 35);
		// Get Max
		System.out.println("Max by example");
		list.stream().collect(Collectors.maxBy(new MaxByMinByExample().new IntegerComp()))
				.ifPresent(i -> System.out.println(i));
		// Get Min
		System.out.println("Min by example");
		list.stream().collect(Collectors.minBy(new MaxByMinByExample().new IntegerComp()))
				.ifPresent(i -> System.out.println(i));
	}

	class IntegerComp implements Comparator<Integer> {
		@Override
		public int compare(Integer i1, Integer i2) {
			if (i1 >= i2) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}