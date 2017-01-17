package com.corejava.polymorphism;

public class ChildClass extends ParentClass {

	/**
	 * Here we are taking the behaviour of the Parent class and changing its
	 * behaviour in child class
	 */
	@Override
	public void doSomething(String input) {
		System.out.println("Child Class Doing Something" + input);
	}

}
