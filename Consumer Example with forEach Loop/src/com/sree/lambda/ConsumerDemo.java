package com.sree.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Sridhar reddy
 *
 *         Instantiate Consumer java.util.function.Consumer is a functional
 *         interface. It accepts an input and returns no result. We instantiate
 *         it as follows for the given object. Consumer<Student> style =
 *         (Student s) -> System.out.println("Name:"+s.name +" and Age:"+s.age);
 *         Here Student is a user class. forEach Loop List can be iterated with
 *         Consumer argument. list.forEach(style); If the containing class in
 *         the collection has a method to print data, we can use forEach as
 *         below. list.forEach(Student::printData); Lambda expression can also
 *         be used for printing values while iterating over collection using
 *         forEach. list.forEach(s -> s.printData());
 */
public class ConsumerDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList();
		list.add(new Student("Ram", 20));
		list.add(new Student("Shyam", 22));
		list.add(new Student("Kabir", 18));
		// Creating instance of Consumer functional interface
		Consumer<Student> style = (Student s) -> System.out.println("Name:" + s.name + " and Age:" + s.age);
		System.out.println("// first way using Consumer");
		// first way using Consumer
		list.forEach(style);
		// second way using method reference
		System.out.println("// second way using method reference");
		list.forEach(Student::printData);
		// third way using lambda expression
		System.out.println("// third way using lambda expression");
		list.forEach(s -> s.printData());
	}
}