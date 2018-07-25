package com.sree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sridhar reddy
 *Map to List with Lambda Expression
To convert Map to List with lambda expression using Collectors.toList() is as follows.
List<String> valueList = map.values().stream().collect(Collectors.toList()); If we want to sort the values before putting into List, we do it as follows.
List<String> sortedValueList = map.values().stream()
			.sorted().collect(Collectors.toList()); 
 */
public class SimpleMapToList {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(23, "Mahesh");
		map.put(10, "Suresh");
		map.put(26, "Dinesh");
		map.put(11, "Kamlesh");
		System.out.println("--Convert Map Values to List--");
		List<String> valueList = map.values().stream().collect(Collectors.toList());
		valueList.forEach(n -> System.out.println(n));

		System.out.println("--Convert Map Values to List using sort--");
		List<String> sortedValueList = map.values().stream().sorted().collect(Collectors.toList());
		sortedValueList.forEach(n -> System.out.println(n));

		System.out.println("--Convert Map keys to List--");
		List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
		keyList.forEach(n -> System.out.println(n));

		System.out.println("--Convert Map keys to List using sort--");
		List<Integer> sortedKeyList = map.keySet().stream().sorted().collect(Collectors.toList());
		sortedKeyList.forEach(n -> System.out.println(n));
	}
}