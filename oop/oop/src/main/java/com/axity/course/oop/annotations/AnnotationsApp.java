package com.axity.course.oop.annotations;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

public class AnnotationsApp {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
//		SomethingOdd somethingOdd = new SomethingOdd();
//		somethingOdd.oldMethod();
//		System.out.println(somethingOdd);

//		if (true)
//			return;

		A a = new A();
		a.setId(10);
		a.setName("A");

		B b = new B();
		b.setId(2);
		b.setName("B");
		b.setHidden("123456");

		C c = new C();
		c.setId(3);
		c.setName("C");
		// Por reflexión se puede obtener la metadata

		System.out.println("====== A");
		analize(a);
		System.out.println("====== B");
		analize(b);
		System.out.println("====== C");
		analize(c);
	}

	private static void analize(Object object) throws IllegalAccessException {
		Watch watch = object.getClass().getDeclaredAnnotation(Watch.class);

		if (watch != null) {
			System.out.println("Analizando " + object.getClass().getName() + ": " + watch.key());
			for (Field field : object.getClass().getDeclaredFields()) {
				watch = field.getDeclaredAnnotation(Watch.class);
				StringBuilder sb = new StringBuilder();
				sb.append("Atributo ").append(field.getName());
				if (watch != null) {
					sb.append(", key: ").append(watch.key());
					field.setAccessible(true);
					sb.append(", value =").append(field.get(object));
				} else {
					sb.append(" no se puede analizar");
				}

				System.out.println(sb.toString());
			}
		} else {
			System.out.println("No se puede analizar");
		}
 
	}

}
