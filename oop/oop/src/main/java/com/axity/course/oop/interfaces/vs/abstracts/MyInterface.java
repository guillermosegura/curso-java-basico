package com.axity.course.oop.interfaces.vs.abstracts;


import com.axity.course.oop.interfaces.A;
import com.axity.course.oop.interfaces.B;
import com.axity.course.oop.interfaces.C;

public interface MyInterface extends A, B, C {

	void doSomething();

	void doSomethingElse();

	default void giveMeFive() {
		doA();
		doB();
		doC();
	}
	
	
}
