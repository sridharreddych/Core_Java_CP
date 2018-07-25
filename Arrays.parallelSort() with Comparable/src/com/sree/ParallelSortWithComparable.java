package com.sree;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author Sridhar reddy
 *users[0] = new User("Ram", 25);
		users[1] = new User("Shyam", 22);
		users[2] = new User("Mohan", 21);
		users[3] = new User("Suresh", 30);
		users[4] = new User("Ramesh", 20);
		users[5] = new User("Dinesh", 27);
 */
public class ParallelSortWithComparable {

	public static void main(String[] args) {

		User[] users = User.getUsers();
		System.out.println("--Sort complete array--");
		Arrays.parallelSort(users);
		Consumer<User> printUser = u -> System.out.println(u.getName() + "-" + u.getAge());
		Arrays.stream(users).forEach(printUser);
		
		System.out.println("--Sort array from index 1 to 4--");
		users = User.getUsers();
		Arrays.parallelSort(users, 1, 4);
		Arrays.stream(users).forEach(printUser);
	}
}