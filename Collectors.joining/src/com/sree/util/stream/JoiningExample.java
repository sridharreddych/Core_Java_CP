package com.sree.util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



/**
 * @author Sridhar reddy
 *Collectors.joining
Collectors.joining joins the stream elements for a given delimiter, prefix and suffix. 
 */
public class JoiningExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		String result = list.stream().collect(Collectors.joining(",", "(", ")"));
		System.out.println(result);
	}
}