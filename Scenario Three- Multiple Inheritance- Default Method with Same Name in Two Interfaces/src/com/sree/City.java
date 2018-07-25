package com.sree;

/**
 * @author Sridhar reddy
 *
 *         In multiple inheritance scenarios, where a class implements more than
 *         one interface, we need to check how default method behaves. Now I am
 *         creating one more interface that contains getBusinessType() as
 *         default method
 */
public interface City {
	void setName(String name);

	void setArea(int area);

	default String getBusinessType() {
		return "Service";
	}
}