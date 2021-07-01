package com.axity.course.oop.interfaces.vs.abstracts;

public class B implements MyInterface {

	@Override
	public void doSomething() {
		System.out.println("Clase B : doSomething");

	}

	@Override
	public void doSomethingElse() {
		System.out.println("Clase B : doSomethingElse");
	}
	
	@Override
	public void doA() {
		System.out.println("Clase B: doA");
		
	}

	@Override
	public void doB() {
		System.out.println("Clase B: doB");
	}

	@Override
	public void doC() {
		System.out.println("Clase B: doC");
	}

}
