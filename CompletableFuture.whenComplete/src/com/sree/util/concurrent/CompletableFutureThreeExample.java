package com.sree.util.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;


/**
 * @author Sridhar reddy
 *CompletableFuture.whenComplete
whenComplete method uses BiConsumer as an argument. Once the calling completion stage completes, whenComplete method applies completion stage result on BiConsumer. 
BiConsumer takes first argument as result and second argument as error if any. 
 */
public class CompletableFutureThreeExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "D");
		list.stream().map(s -> CompletableFuture.supplyAsync(() -> s + s))
				.map(f -> f.whenComplete((result, error) -> System.out.println(result + " Error:" + error))).count();
	}
}