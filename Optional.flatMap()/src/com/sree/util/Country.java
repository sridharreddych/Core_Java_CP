package com.sree.util;

import java.util.Optional;

/**
 * @author Sridhar reddy
 *Country class is using PrimeMinister class and Person class is using Country class.
 */
public class Country {
	Optional<PrimeMinister> primeMinister;

	public Country() {
	}

	public Country(Optional<PrimeMinister> primeMinister) {
		this.primeMinister = primeMinister;
	}

	public Optional<PrimeMinister> getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(Optional<PrimeMinister> primeMinister) {
		this.primeMinister = primeMinister;
	}
}