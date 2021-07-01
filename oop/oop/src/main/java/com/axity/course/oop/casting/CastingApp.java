package com.axity.course.oop.casting;

import java.util.Arrays;

public class CastingApp {

	public static void main(String[] args) {
		Dog cat = new Dog();
		Animal animal = cat;

		// animal.eat();
		// animal.meow();
		// ((Meow)animal).meow();

		// AnimalFeeder animalFeeder = new AnimalFeeder();

		CastingApp app = new CastingApp();
//		app.animalFeeder();

		// app.instanceOf();
		// app.classCast();
		app.reflection();

		// app.classCastException();

	}

	private void instanceOf() {
		Animal animal = new Dog();

		if (animal instanceof Cat) {
			System.out.println("animal is Cat");
			((Cat) animal).meow(); // downcasting a la clase
		} else if (animal instanceof Dog) {
			System.out.println("Animal is Dog");
			((Dog) animal).woof();
		}

		if (animal instanceof Meow) {
			System.out.println("animal is Meow");
			((Meow) animal).meow(); // downcasting a la interfaz
		}
	}

	private void classCast() {
		Animal animal = new Cat();

		if (Cat.class.isInstance(animal)) {
			System.out.println("animal is Cat");
			((Cat) animal).meow(); // downcasting a la clase
		}

		if (Meow.class.isInstance(animal)) {
			System.out.println("animal is Meow");
			((Meow) animal).meow(); // downcasting a la interfaz
		}
	}

	private void reflection() {
		Animal animal = new Cat();
		System.out.println("-----");

		Class<?> zz = animal.getClass();
		System.out.println(zz.getName());
		System.out.println(zz.getSimpleName());
		System.out.println(zz.getCanonicalName());
		System.out.println("--------------");

		if (animal.getClass().equals(Cat.class)) {
			System.out.println("animal is Cat");
			((Cat) animal).meow(); // downcasting a la clase
		}

		Class[] classes = animal.getClass().getInterfaces();
		boolean isMeow = false;
		for (Class clazz : classes) {
			if (clazz.equals(Meow.class)) {
				isMeow = true;
				break;
			}
		}

		if (Arrays.stream(animal.getClass().getInterfaces()).filter(i -> i.equals(Meow.class)).findAny().isPresent()) {
			System.out.println("animal is Meow");
			((Meow) animal).meow(); // downcasting a la interfaz
		}
	}

	private void classCastException() {
		Animal animal;
		animal = new Dog();

		// ((Cat) animal).meow();
		// ((Meow) animal).meow();

		// String s = (String) animal;
	}

	private void animalFeeder() {
		Cat cat = new Cat();
		Dog dog = new Dog();

		AnimalFeeder animalFeeder = new AnimalFeeder();
		animalFeeder.feed(cat, dog);

	}

}
