package com.sree;

/**
 * @author Sridhar reddy
 *
 *         Find the main method to test the static method.
 */
public class Main {
	public static void main(String[] args) {
		Location lo = new Location();
		System.out.println(lo.getBusinessType());
		System.out.println("Village id:" + Village.getVillageId());
		System.out.println("Location Id:" + lo.getLocationId());
	}
}