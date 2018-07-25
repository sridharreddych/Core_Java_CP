package com.sree;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MethodParameterNamesDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Method[] methods = BookService.class.getDeclaredMethods();

		for (Method m : methods) {
			System.out.println("method name is.........");
			System.out.println(m.getName()); // m if you want replace with method
			System.out.println("-------------");

			Parameter[] parameters = m.getParameters();

			for (Parameter p : parameters) {
				if (p.isNamePresent()) {
					System.out.println(p.getName());
				}
			}
		}
	}
}