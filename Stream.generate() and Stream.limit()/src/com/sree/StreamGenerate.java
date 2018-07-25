package com.sree;

import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {

		String str = "Hello World!";
		Stream<String> stream = Stream.generate(str::toString).limit(5);
		stream.forEach(s -> System.out.println(s));
		
		/*
		 * 
		 * Stream.generate() and Stream.limit()

generate(): We need to pass Supplier to this method and it will return an infinite sequential unordered stream. 
limit(): We need to pass a max value and it returns the stream up to the max number of elements. 
		 */
	}
}