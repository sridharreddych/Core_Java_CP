package com.sree;

import java.util.Optional;

public class OptionalflatMap {
	
	public static void main(String[] args) {
		
		Optional<PrimeMinister> primeMinister = Optional.of(new PrimeMinister("Narendra Modi", 65));
		Optional<Country> country = Optional.of(new Country(primeMinister));
		Optional<Person> person = Optional.of(new Person(country));
		
		
		String pmName = person.flatMap(Person::getCountry).flatMap(Country::getPrimeMinister)
				.map(PrimeMinister::getName).orElse("None");
		System.out.println(pmName);
	}
}