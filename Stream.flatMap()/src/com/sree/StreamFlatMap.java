package com.sree;

import java.util.Arrays;

public class StreamFlatMap {

	public static void main(String[] args) {

		Integer[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
		Integer[][] data1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		Arrays.stream(data).flatMap(row -> Arrays.stream(row)).filter(num -> num % 2 == 1)
				.forEach(s -> System.out.print(s + " "));
		
		System.out.println("HOOOOOOOOOOOOO");
		Arrays.stream(data1).flatMap(row -> Arrays.stream(row)).filter(num -> num % 2 == 1)
		.forEach(s -> System.out.print(s + " "));
		
		
	}
}