package com.corejava.polymorphism;

public class PolymorphismTest {

	public void testOverriding_ChangeTheBehaviour() {
		System.out.println("********** Instantiating the Parent class and calling its behaviour **********");
		ParentClass pc = new ParentClass();
		pc.doSomething("Hello");

		System.out.println("********** Instantiating the Child class and calling its behaviour **********");
		ChildClass cc = new ChildClass();
		cc.doSomething("Hello");

		System.out.println("************ Instantiating the Child Class by having Parent Class Reference"
				+ " and calling its behaviour ***********");
		ParentClass cP = new ChildClass();
		cP.doSomething("Hello");

	}

	public void testOverloading() {

	}

	public static void main(String[] args) {
		PolymorphismTest pt = new PolymorphismTest();

		pt.testOverriding_ChangeTheBehaviour();
	}
}
