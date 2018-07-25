package com.sree.util.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author Sridhar reddy
 *Collectors.toMap
Collectors.toMap collects the stream element as Map. We need to define function to generate key and value for stream input value
 */
public class ToMapExample {

	public static void main(String[] args) {

		Map<String, String> map = Stream.of("AA", "BB", "CC").collect(Collectors.toMap(k -> k, v -> v + v));
		map.forEach((k, v) -> System.out.println("key:" + k + "  value:" + v));
	}
}