package com.axity.course.sintaxis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wrapper {

	public static void main(String[] args) {
		
		int execute = 0b100; 
		int write = 0b010; // 1000
		int read= 0b001; 
		
		int permisos = execute | write | read;
		permisos = permisos & 0b011;
		System.out.println(permisos);
		System.out.println(Integer.toBinaryString(permisos));

//		char[] array = { '1', '2' };
//
//		int s = 0;
//		for (char c : array) {
//			s += Integer.valueOf(String.valueOf(c)).intValue();
//		}
//		System.out.println(s);

		// System.out.println(s);

//		if(true)return;
//		int a = 1;// no se hace boxing:   primitivo a primitivo
//		int b = Integer.valueOf(1); //  se hace autoboxing (unboxing):  Integer a primitivo
//		int c = Integer.valueOf(1).intValue(); // NO se hace primitivo a primitivo
//		
//		Integer d = 1; // se hace un boxing:  primitivo a Integer
//		Integer e = Integer.valueOf(1); // No se hace autoboxing: Integer a Integer
//		
//		Integer f = Integer.valueOf(7895); //new Integer(5);
//		
//		
//		
//		Student s1 = new Student("Juan", "Perez", 20);
//		Student s2 = new Student("Juan", "Perez", 20);
//		
//		System.out.println(s1 == s2);
//		
//		Integer a1 = Integer.valueOf(5);
//		Integer a2 = 5;
//		Integer a3 = new Integer(5);
//		
//		System.out.println("---------------");
//		System.out.println(a1 == a2);
//		System.out.println(a1 == a3);
//		
//
//		System.out.println(a1.equals(a2));
//		System.out.println(a1.equals(a3));
//		
//		;
//		int n = a1.intValue() * 3;
//		System.out.println(n);
	}

}
