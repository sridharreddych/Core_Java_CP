package com.sree.util;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author Sridhar reddy Optional.filter() filter() method takes Predicate
 *         instance as an argument. The value in Optional instance is filtered
 *         and if filtered value is not empty then value is returned otherwise
 *         empty Optional instance is returned.
 *         
 *         Quite interesting learning here for me just remember ****************
 */
public class Optionalfilter {
	public static void main(String[] args) {
		Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
		// Using Optional.filter
		Predicate<PrimeMinister> pmPredicate = p -> p.getName().length() > 15;
		Predicate<PrimeMinister> pmPredicate1 = p -> p.getName().length() < 15;
		System.out.println(pm.filter(pmPredicate));
		
		System.out.println(pm.filter(pmPredicate1).get().name);
		//Optional<String> pName =  pm.map(PrimeMinister::getName);
		//String pName1 =  pm.map(PrimeMinister::getName).orElse("None");
		
		/*System.out.println(pm.filter(pmPredicate));
		System.out.println(pName.filter(pmPredicate1));
		System.out.println(pName1.filter(pmPredicate1));*/
	}
}