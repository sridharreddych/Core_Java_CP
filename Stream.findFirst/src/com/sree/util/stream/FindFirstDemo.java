package com.sree.util.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sridhar reddy Stream.findFirst findFirst() returns first element of
 *         the stream and if stream has defined no encounter order, then it may
 *         return any element. If stream is empty, it returns empty Optional
 *         instance.
 * 
 */
public class FindFirstDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("XX", "YY", "ZZ");
		list.stream().findFirst().ifPresent(s -> System.out.println(s));
	}
}