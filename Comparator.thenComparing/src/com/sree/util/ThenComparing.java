package com.sree.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sridhar reddy
 *Comparator.thenComparing
Comparator.thenComparing is a default method of the Comparator introduced in Java 8. If we have two Comparator instance, 
then we can use both comparator using Comparator.thenComparing. We call another Comparator by first Comparator. Find the example.
 */
public class ThenComparing {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Shyam", 22);
		Student s2 = new Student("Ram", 22);
		Student s3 = new Student("Mohan", 19);
		List<Student> list = Arrays.asList(s1, s2, s3);
		Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		Collections.sort(list, ageComparator.thenComparing(nameComparator));
		//Collections.sort(list, nameComparator);
		list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
	}
}

/*
//  age
Name:Mohan Age:19
Name:Shyam Age:22
Name:Ram Age:22

//name
Name:Mohan Age:19
Name:Ram Age:22
Name:Shyam Age:22

//age then name

Name:Mohan Age:19
Name:Ram Age:22
Name:Shyam Age:22
*/