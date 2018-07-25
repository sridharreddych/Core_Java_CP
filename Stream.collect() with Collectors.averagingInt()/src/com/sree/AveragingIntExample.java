package com.sree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AveragingIntExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Double result = list.stream().collect(Collectors.averagingInt(v -> v * 2));
		System.out.println("Average: " + result);
	}
}