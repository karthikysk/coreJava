package com.corejava.polymorphism;

public class ParentClass {

	public void doSomething(String input) {
		System.out.println("Parent Class Doing something" + input);
	}

	/**
	 * overloading the behaviour doSomething : changing paramerts of the
	 * behaviour
	 * 
	 * @param input
	 */
	public void doSomething(int input) {
		System.out.println("Parent Class Doing something" + input);
	}

}
