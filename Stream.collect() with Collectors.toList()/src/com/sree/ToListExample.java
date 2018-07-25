package com.sree;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListExample {
	
    public static void main(String[] args) {
    	
    	String[] strArray = {"AA", "BB", "CC"};
        List<String> list = Arrays.stream(strArray).collect(Collectors.toList());
        list.forEach(s->System.out.println(s));
     }
} 