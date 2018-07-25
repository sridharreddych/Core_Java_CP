package com.sree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxMin {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("G", "B", "F", "E");
		
		List<String> list1 = Arrays.asList("2", "9", "3", "6");
		
		String max = list.stream().max(Comparator.comparing(String::valueOf)).get();
		String max1 = list1.stream().max(Comparator.comparing(String::valueOf)).get();
		
		System.out.println("Max:" + max);
		System.out.println("Max1:" + max1);
		
		String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
		
		String min1 = list1.stream().min(Comparator.comparing(String::valueOf)).get();
		
		System.out.println("Min:" + min);
		
		System.out.println("Min:" + min1);
	}
}