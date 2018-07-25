package com.sree;

import java.util.Arrays;
import java.util.List;



/**
 * @author Sridhar reddy
 *Stream.collect() using Supplier, Accumulator and Combiner
The syntax of Stream.collect() using supplier, accumulator, combiner is as follows. 

collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)


supplier : It creates a new result container which will be populated by accumulator and combiner and finally it will be returned by collect() method. In parallel processing the Supplier function will be called multiple times that will return fresh value each time. 
accumulator : It incorporates additional element into the result. 
combiner : It combines two values that must be compatible with accumulator. Combiner works in parallel processing. 

If we use list.stream() then the output will be different because it is not parallel processing and so nothing to combine.
 */
public class StreamCollect {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
		
		String result = list.parallelStream()
				.collect(StringBuilder::new, (response, element) -> response.append(" ").append(element),
						(response1, response2) -> response1.append(",").append(response2.toString()))
				.toString();
		
		String result1 = list.stream()
				.collect(StringBuilder::new, (response, element) -> response.append(" ").append(element),
						(response1, response2) -> response1.append(",").append(response2.toString()))
				.toString();
		
		//collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)
		System.out.println("Result: " + result);
		
		System.out.println("Result: " + result1);
	}
}