package com.sree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sridhar reddy
 *Convert Map to List of User Object Example
 */
public class MapToListOfUserObject {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(23, "Mahesh");
		map.put(10, "Suresh");
		map.put(26, "Dinesh");
		map.put(11, "Kamlesh");

		List<Person> list = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey()))
				.map(e -> new Person(e.getKey(), e.getValue())).collect(Collectors.toList());

		list.forEach(l -> System.out.println("Id: " + l.getId() + ", Name: " + l.getName()));
		
		/*
		 * List<String> sortedValueList = map.values().stream().sorted().collect(Collectors.toList());
		sortedValueList.forEach(n -> System.out.println(n));
		
		List<String> valueList = map.values().stream().collect(Collectors.toList());
		valueList.forEach(n -> System.out.println(n));
		 */
		
		/*
		 * Id: 10, Name: Suresh
Id: 11, Name: Kamlesh
Id: 23, Name: Mahesh
Id: 26, Name: Dinesh Here the list has been sorted by Map key and if we want to sort it by value, we need to use 
Comparator.comparing(e -> e.getValue()) 
and then output will be as follows.
Id: 26, Name: Dinesh
Id: 11, Name: Kamlesh
Id: 23, Name: Mahesh
Id: 10, Name: Suresh 
		 */
	}
}