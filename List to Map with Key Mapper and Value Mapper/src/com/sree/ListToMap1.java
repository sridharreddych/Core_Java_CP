package com.sree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Sridhar reddy
 *List to Map with Key Mapper and Value Mapper
Here we will pass mapping function of key mapper and value mapper. The syntax of method is as follows. toMap(Function keyMapper, Function valueMapper) Now find a simple example. 
 */
public class ListToMap1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Mohan");
		list.add("Sohan");
		list.add("Mahesh");
		Map<String, Object> map = list.stream().collect(Collectors.toMap(Function.identity(), s -> s));
		map.forEach((x, y) -> System.out.println("Key: " + x + ", value: " + y));
	}
}