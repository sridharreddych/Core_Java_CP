package com.sree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SortDemo {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Mahesh"));
		list.add(new Person(2, "Ram"));
		list.add(new Person(3, "Krishna"));
		
		Consumer<Person> style = (Person p) -> System.out.println("id:" + p.getPid() + ", Name:" + p.getName());
		System.out.println("---Before Sorting---");
		
		list.forEach(style);
		
		list.sort(new PersonComparatorByName());
		
		System.out.println("---After Sorting---");
		
		list.forEach(style);
	}
}