package com.sree.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Sridhar reddy
 *
 *         Example 1: Using Runnable with Lambda Expression In the below example
 *         we are running a Runnable thread. Before lambda expression, to
 *         achieve runnable thread, we need to define a class which implements
 *         Runnable interface to get runnable object. Now see how to achieve
 *         using lambda expressions the same object.
 */
public class RunnableDemo {
	public static void main(String[] args) {
		final ExecutorService exService = Executors.newSingleThreadExecutor();
		Runnable r = () -> System.out.println("Lambda Expression Test with Runnable");
		exService.execute(r);
	}
}