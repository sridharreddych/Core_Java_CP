package com.sree;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Sridhar reddy
 *Stream.collect() using Collector
Stream.collect() also accepts single argument. 

collect(Collector collector)

It is useful to perform many operations like summation, grouping, joining etc. Find the example for summation. 
 */
public class SumOfListDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(23, 43, 12, 25);
		IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(i -> i + i));
		System.out.println("Sum:" + stats.getSum());
	}
}