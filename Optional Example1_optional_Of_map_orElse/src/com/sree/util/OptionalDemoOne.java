package com.sree.util;

import java.util.Optional;

/**
 * @author Sridhar reddy Optional.of() of() method creates and returns the
 *         Optional instance for the given class. We can apply other method of
 *         Optional class. Optional.map() map() method runs the given method in
 *         the argument if the instance is not null otherwise it returns empty
 *         Optional instance. The argument which is a function cannot have
 *         Optional mapper. Optional.orElse() It returns the value in the
 *         Optional instance for the mapping method otherwise it returns the
 *         value provided in orElse() argument. Now find a class named
 *         PrimeMinister.
 */
public class OptionalDemoOne {
	public static void main(String[] args) {
		Optional<PrimeMinister> pm = Optional.of(new PrimeMinister());
		String pmName = pm.map(PrimeMinister::getName).orElse("None");
		System.out.println("With out assigning any value to Prime Minister");
		System.out.println(pmName);
		// Assign Some Value to PrimeMinister.name
		pm = Optional.of(new PrimeMinister("Narendra Modi"));
		pmName = pm.map(PrimeMinister::getName).orElse("None");
		System.out.println("By assigning any value to Prime Minister");
		System.out.println(pmName);
	}
}

/*
 * java.util.Optional class has been introduced in java 8, that will avoid
 * NullPointerException in our code. We can write our code more readable and in
 * fewer lines because now we will not apply if else condition for
 * NullPointerException. Optional class will check for null value and if null
 * value is present then it will return empty Optional instance. Before Java 8
 * we avoid NullPointerException as below. Before Java 8 String s="None";
 * if(person !=null) { if (country != null) { if (primeMinister != null){
 * System.out.println(name); } } } Now in Java 8, we have Optional class that
 * can avoid NullPointerException efficiently with fewer line of code as below.
 * In Java 8 String pmName=
 * person.flatMap(Person::getCountry).flatMap(Country::getPrimeMinister)
 * .map(PrimeMinister::getName).orElse("None");
 * 
 * 
 */