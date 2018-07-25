package com.sree;

/**
 * @author Sridhar reddy
 *
 *         Scenario One: Default Method in Interface To understand using default
 *         method, I am creating an interface Village that has some method
 *         declarations and one default method. Default method starts with
 *         default keyword. By default all methods of interface will be public,
 *         so no need to use public keyword to declare and define methods in
 *         interface.
 */
public interface Village {

	void setNumOfPeople(int num);

	void setName(String name);

	static int getVillageId() {
		return 1;
	}

	default String getBusinessType() {
		return "Business type is Farming  and village id:" + getVillageId();
	}
}