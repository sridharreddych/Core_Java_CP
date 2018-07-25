package com.sree;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sridhar reddy
 *Stream.reduce() with Identity, Accumulator and Combiner
Here we will pass three arguments identity, accumulator and combiner in reduce() method. This method with these three arguments is used in parallel processing. Combiner works with parallel stream only, otherwise there is nothing to combine. 

reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
 */
public class ReduceDemo3 {

	public static void main(String[] args) {

		List<Integer> list2 = Arrays.asList(2, 3, 4);
		// Here result will be 2*2 + 2*3 + 2*4 that is 18.
		int res = list2.parallelStream().reduce(1, (s1, s2) -> s1 * s2, (p, q) -> p + q);
		int res1 = list2.parallelStream().reduce(2, (s1, s2) -> s1 * s2, (p, q) -> p + q);
		int res2 = list2.parallelStream().reduce(3, (s1, s2) -> s1 * s2, (p, q) -> p + q);
		int res3 = list2.parallelStream().reduce(4, (s1, s2) -> s1 * s2, (p, q) -> p + q);
		int res4 = list2.parallelStream().reduce(1, (s1, s2) -> s1 * s2, (p, q) -> p + q);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
		String result = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2, (p, q) -> p + q);
		System.out.println(result);
	}
}