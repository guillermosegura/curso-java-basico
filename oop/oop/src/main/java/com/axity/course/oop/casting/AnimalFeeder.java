package com.axity.course.oop.casting;

public class AnimalFeeder {
	public void feed(Animal... animals) {
		for (Animal animal : animals) {
			animal.eat();
		}
	}
}
