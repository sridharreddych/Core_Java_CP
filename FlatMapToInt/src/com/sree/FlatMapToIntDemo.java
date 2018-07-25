package com.sree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Sridhar reddy
 *flatMapToInt
It is used for primitive int data type. It returns IntStream. 
According to java doc.

"Returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced
 by applying the provided mapping function to each element." 
 */
public class FlatMapToIntDemo {

	public static void main(String[] args) {

		int[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		IntStream is1 = Arrays.stream(data).flatMapToInt(row -> Arrays.stream(row));
		System.out.println(is1.sum());

		int[] l1 = { 4, 8, 9 };

		IntDemoPerson p1 = new IntDemoPerson("Ram", l1);
		int[] l2 = { 2, 7, 8 };

		IntDemoPerson p2 = new IntDemoPerson("Shyam", l2);
		List<IntDemoPerson> list = Arrays.asList(p1, p2);
		IntStream is2 = list.stream().flatMapToInt(row -> Arrays.stream(row.getLuckyNum()));
		//is2.forEach(x -> System.out.println("Result is"+ " "+  x));
		System.out.println(is2.max().getAsInt());
	}
}

class IntDemoPerson {
	private String name;
	private int[] luckyNum;

	public IntDemoPerson(String name, int[] luckyNum) {
		this.name = name;
		this.luckyNum = luckyNum;
	}

	public String getName() {
		return name;
	}

	public int[] getLuckyNum() {
		return luckyNum;
	}
}