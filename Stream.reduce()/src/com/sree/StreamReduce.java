package com.sree;

import java.util.Arrays;

public class StreamReduce {

	public static void main(String[] args) {

		int[] array = { 3, 5, 10, 15 };
		int sum = Arrays.stream(array).reduce(1, (x, y) -> x + y);
		System.out.println("Sum:" + sum);
		
		/*
		 * 
		 * Stream.reduce()
It performs reduction on stream elements using a start value and accumulation function. 
		 */
	}
}