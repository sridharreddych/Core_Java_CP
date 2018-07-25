package com.sree;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ConstructorParameterNamesDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Constructor<?>[] constructors = BookService.class.getDeclaredConstructors();
		//Method[] methods = BookService.class.getDeclaredMethods(); just for reference nothing to do with this class

		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor.getName());
			System.out.println("-------------");
			Parameter[] parameters = constructor.getParameters();
			for (Parameter p : parameters) {
				if (p.isNamePresent()) {
					System.out.println(p.getName());
				}
			}
		}
		
		/*
		 * for (Method m : methods) {
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
		 * 
		 */
	}
}