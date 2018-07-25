package com.sree;

/**
 * @author Sridhar reddy
 *
 *         I am doing some changes in Location class to use static method. We
 *         can use static method by interface name.
 */
public class Location implements Village {
	public int noOfPeople;
	public String name;

	@Override
	public void setNumOfPeople(int n) {
		this.noOfPeople = n;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public int getLocationId() {
		return Village.getVillageId();
	}
}