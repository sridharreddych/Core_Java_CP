package com.sree.util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Sridhar reddy
 *Collectors.summingInt
Collectors.summingInt adds all element of stream for integer data type. 
 */
public class SummingIntExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30, 10, 20, 35);
		int result = list.stream().collect(Collectors.summingInt(i -> i));
		System.out.println(result);
	}
}