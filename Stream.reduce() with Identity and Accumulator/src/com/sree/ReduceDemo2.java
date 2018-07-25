package com.sree;
import java.util.Arrays;


/**
 * @author Sridhar reddy
 *Stream.reduce() with Identity and Accumulator
Here will use an identity and accumulator. We will pass the identity as start value. 

reduce(T identity, BinaryOperator<T> accumulator)
 */
public class ReduceDemo2 {
	
    public static void main(String[] args) {
    	
    	  int[] array = {23,43,56,97,32};
    	  //Set start value. Result will be start value + sum of array. 
    	  int startValue = 100;
    	  int sum = Arrays.stream(array).reduce(startValue, (x,y) -> x+y);
    	  System.out.println(sum);
    	  sum = Arrays.stream(array).reduce(startValue, Integer::sum);
    	  System.out.println(sum);
    	  sum = Arrays.stream(array).reduce(startValue, StatisticsUtility::addIntData);
    	  System.out.println(sum);
    }
}  