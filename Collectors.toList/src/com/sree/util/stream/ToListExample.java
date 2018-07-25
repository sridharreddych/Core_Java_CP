package com.sree.util.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author Sridhar reddy
 *Collectors.toList
Collectors.toList collects the stream data as List for the given data type. 
 */
public class ToListExample {

	public static void main(String[] args) {

		List<String> list = Stream.of("AA", "BB", "CC").collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));
	}
}