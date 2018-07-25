package com.sree;

import java.util.Arrays;
import java.util.List;

public class FlatmapWithList {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
		Writer w1 = new Writer("Mohan", books);
		
		books = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
		Writer w2 = new Writer("Sohan", books);
		
		List<Writer> writers = Arrays.asList(w1, w2);
		
		Book book = writers.stream().flatMap(writer -> writer.getBooks().stream()).max(new BookComparator()).get();
		
		//Book book1 = writers.stream().flatMap(writer -> writer.getBooks().stream()).max(new BookComparator()).get();
		System.out.println("Name:" + book.getName() + ", Price:" + book.getPrice());
		
		/*
		
		List<Book> list1 = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
    	List<Book> list2 = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
    	List<List<Book>> finalList = Arrays.asList(list1, list2);
    	Book book = finalList.stream().flatMap(list -> list.stream()).min(new BookComparator()).get();
    	System.out.println("Name:"+book.getName()+", Price:"+ book.getPrice() );

		*/
	}
}