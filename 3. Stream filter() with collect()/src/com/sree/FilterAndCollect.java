package com.sree;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sridhar reddy
 * 3. Stream filter() with collect()
Here we are filtering a list and then counting the number of elements. 
 *
 */
public class FilterAndCollect {
	
	public static void main(String[] args) {
		
		List<User> list = User.getUsers();
		
		long count = list.stream().filter(u -> u.getName().endsWith("sh"))
				.collect(Collectors.counting());
		
		System.out.println("Number of users ending name with 'sh': "+ count);
		
	}
} 