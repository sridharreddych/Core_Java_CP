package com.sree;

import java.util.Arrays;

public class StreamSkip {

	public static void main(String[] args) {

		int[] array = { 3, 5, 10, 15 };
		Arrays.stream(array).skip(3).forEach(s -> System.out.println(s + " "));
		
		/*
		 * 
		 * Stream.skip()
It returns a stream skipping the given number of elements. 
		 */
	}
}