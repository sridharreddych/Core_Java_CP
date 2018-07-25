package com.sree;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.iterate(1, n -> n * 2).limit(5);
		
		Stream<Integer> stream1 = Stream.iterate(2, k -> k * 2).limit(5);
		
		stream.forEach(s -> System.out.print(s + " "));
		
		stream1.forEach(s -> System.out.print(s + " "));
	}
}