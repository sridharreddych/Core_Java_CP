package com.sree.util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Sridhar reddy Stream.count count() method in stream API just counts
 *         the elements in stream object. It returns long value. In our example
 *         we have a list and we convert it into stream then apply count()
 *         method on it.
 */
public class CountDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "AB", "CC");
		Predicate<String> predicate = s -> s.startsWith("A");
		Predicate<String> predicate1 = s -> s.endsWith("C");
		long l = list.stream().filter(predicate).count();
		long l1 = list.stream().filter(predicate1).count();
		
		System.out.println("Number of Matching Element:" + l);
		System.out.println("Number of Matching Element:" + l1);
	}
}