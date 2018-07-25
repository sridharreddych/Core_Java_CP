package com.sree.util;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author Sridhar reddy Optional.ifPresent() ifPresent() method takes Consumer
 *         instance as an argument and if value is present then it run the given
 *         consumer passed as an argument otherwise do nothing.
 */
public class OptionalifPresent {
	public static void main(String[] args) {
		Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
		// Using Optional.ifPresent
		Consumer<PrimeMinister> pmConsumer = (PrimeMinister p) -> System.out.println(p.getName());
		pm.ifPresent(pmConsumer);
	}
}