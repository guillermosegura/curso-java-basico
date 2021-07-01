package com.axity.course.oop.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.axity.course.oop.casting.Animal;
import com.axity.course.oop.casting.Cat;

public class ReflectionApp {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person();

		// Clase de la instancia person
		Class clazz = person.getClass();

		// Atributos de la clase
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			// Modificador del atributo
			String modifier = Modifier.toString(field.getModifiers());
			// Tipo
			Class fieldClass = field.getType();
			System.out.println(modifier + " " + fieldClass.getTypeName() + " " + field.getName());

		}
		System.out.println("--------");
		Animal animal = new Cat();
		for (Class interfaz : animal.getClass().getInterfaces()) {
			System.out.println(interfaz.getName() + " isInterface " + interfaz.isInterface());

		}

		System.out.println("--------");
		Constructor[] constructors = animal.getClass().getDeclaredConstructors();
		Object hiddenAnimal = null;
		for (Constructor c : constructors) {
			String modifier = Modifier.toString(c.getModifiers());
			System.out.println(modifier + " " + c.getName() + " c:" + c.getParameterCount());
			if (Modifier.isPublic(c.getModifiers()) && c.getParameterCount() == 0) {
				// lanza varias excepciones: InstantiationException, IllegalAccessException,
				// IllegalArgumentException, InvocationTargetException
				hiddenAnimal = c.newInstance();
			}
		}
		if (hiddenAnimal instanceof Cat) {
			System.out.println("hiddenAnimal is a Cat");
		}
		System.out.println("--------");

		Object chimaeram = null;
		for (Constructor c : Cat.class.getDeclaredConstructors()) {
			if (Modifier.isPublic(c.getModifiers()) && c.getParameterCount() == 0) {
				// lanza varias excepciones: InstantiationException, IllegalAccessException,
				// IllegalArgumentException, InvocationTargetException

				chimaeram = c.newInstance();
			}
		}
		if (chimaeram instanceof Cat) {
			System.out.println("chimaeram is a Cat");
		}

		System.out.println("-------");
		for (Method method : chimaeram.getClass().getDeclaredMethods()) {
			if (Modifier.isPublic(method.getModifiers()) && method.getName().equals("meow")
					&& method.getParameterCount() == 0) {
				System.out.println("Ladies & gentlemen behold the CHIMERA !!!!");
				// lanza varias excepciones:IllegalAccessException, IllegalArgumentException,
		        // InvocationTargetException
				method.invoke(chimaeram);
			}
		}

	}

}
