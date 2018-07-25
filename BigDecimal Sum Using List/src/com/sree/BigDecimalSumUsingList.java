package com.sree;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BigDecimalSumUsingList {

	public static void main(String[] args) {

		Person p1 = new Person("AAA", new BigDecimal("45.23"));
		Person p2 = new Person("BBB", new BigDecimal("55.43"));
		Person p3 = new Person("CCC", new BigDecimal("65.21"));
		Person p4 = new Person("DDD", new BigDecimal("35.73"));

		List<Person> list = Arrays.asList(p1, p2, p3, p4);

		BigDecimal sum = list.stream().map(Person::getWeight).reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(sum);

		sum = list.stream().map(p -> p.getWeight()).reduce(BigDecimal.ZERO, (b1, b2) -> b1.add(b2));
		System.out.println(sum);

		sum = list.stream().map(Person::getWeight).reduce(BigDecimal.ZERO, Utility::addWeight);
		System.out.println(sum);

	}
}

/*

On this page we will provide java 8 BigDecimal sum example. We will use lambda expression for summation of List, Map and Array of 
BigDecimal. Using Stream.reduce() method we reduce the collection of BigDecimal to the summation. In case of 
collection of entity which consists an attribute of BigDecimal, we can use Stream.map() method to get the stream of BigDecimal instances.
BigDecimal Sum with Lambda Expression
To get sum of BigDecimal instances we do as follows using Lambda Expression.
BigDecimal sum = Arrays.stream(bdArray).reduce(BigDecimal.ZERO, (p, q) -> p.add(q)); In the above code we are using 
Stream.reduce(BigDecimal identity, BinaryOperator<BigDecimal> accumulator) 
Accumulator can also be passed as follows in reduce() method.
BigDecimal sum = list.stream().map(Person::getWeight)
                                .reduce(BigDecimal.ZERO, BigDecimal::add);  Where add() is the method of BigDecimal class. We can also create custom method for summation. For example we have created addWeight() method in our custom class Utility which is using BigDecimal.add() method.
BigDecimal sum = map.values().stream().reduce(BigDecimal.ZERO, Utility::addWeight);  
*/