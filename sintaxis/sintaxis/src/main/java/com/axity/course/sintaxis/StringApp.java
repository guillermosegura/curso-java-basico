package com.axity.course.sintaxis;

public class StringApp {
	public static void main(String args[]) {
		String hello = "Hola mundo!";

		String h2 = "Hola " + "mundo!";

		System.out.println(hello.equals(h2));
		System.out.println(hello == h2);
		
		if(true)return;

		// Longitud de una cadena
		System.out.println(hello.length());

		// To Uppercase
		System.out.println(hello.toUpperCase());

		// To Lowercase
		System.out.println(hello.toLowerCase());

		// Concatenar cadenas 1
		System.out.println(hello.concat(" otra cadena"));

		// Concatenar cadenas 2
		System.out.println(hello + " otra cadena");

		// Contiene la subcadena
		System.out.println(hello.contains("mun"));

		// Caracter en el índice
		System.out.println(hello.charAt(3));

		// Igualdad
		System.out.println(hello.equals("Hola mundo!"));

		// Igualdad ignora el case
		System.out.println(hello.equalsIgnoreCase("HOLA MUNDO!"));

		System.out.println(hello.substring(5));

		System.out.println(hello.substring(0, 5));

		System.out.println(hello.indexOf('m'));

		System.out.println(hello.indexOf("mun"));

		System.out.println(Integer.parseInt("4f", 16));
	}
}
