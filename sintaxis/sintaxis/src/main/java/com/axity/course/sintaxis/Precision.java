package com.axity.course.sintaxis;

import java.math.BigDecimal;

/**
 * Clase para demostrar el error de punto flotante
 * 
 * @author guillermo.segura@axity.com
 *
 */
public class Precision {

	public strictfp static void main(String[] args) {

		float f1 = 1.1f;
		double f2 = 2.2f;
		System.out.println(f1 + f2);

		double d1 = 1.1;
		double d2 = 2.2;
		
		
		System.out.println(d1 + d2);
		


		BigDecimal bigDecimal1 = new BigDecimal("1.10");
		BigDecimal bigDecimal2 = new BigDecimal("2.20");

		System.out.println(bigDecimal1.add(bigDecimal2));
		
		
		if (true)return;

		byte b = Byte.MIN_VALUE; // -128
		b = Byte.MAX_VALUE; // 127
		short s = Short.MIN_VALUE; // -32,768
		s = Short.MAX_VALUE; // 32,767
		int i = Integer.MIN_VALUE; // -2,147,483,648
		i = Integer.MAX_VALUE; // 2,147,483,647
		long l = Long.MIN_VALUE; // -9,223,372,036,854,775,808
		l = Long.MAX_VALUE; // 9,223,372,036,854,775,807

		char letter = 'A';
		letter = '\u00e1';

		System.out.println(letter);

		letter = 65;
		System.out.println("[" + letter + "]");
		letter = 225;
		System.out.println("[" + letter + "]");
		letter = 10;
		System.out.println("[" + letter + "]");

		String hello = "Hello world!";
		hello = new String("Hello world!");
		hello = new String(new char[] { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '!' });
		System.out.println(hello);
		System.out.println("-----------");
		System.out.println(Long.parseLong("1024545") == 1024545L);

		double nnnn = 1;
		System.out.println(nnnn);
		System.out.println(1L * 1.0);
		System.out.println(1 + 1.0);
		System.out.println(1.0f + 1.5);

		System.out.println("-----------");
		Precision p = new Precision();

		p.casting();
		System.out.println("-----------");
		p.arithmetic();
		
		System.out.println("=====");
 
		System.out.println( -6 << 3 );
	}

	private void casting() {
		short a = (short) 1L;
		byte b = (byte) 1.0;
		int c = (int) 1.0f;

		System.out.println((short) (1L * 1.0));
		System.out.println((byte) (1 + 1.0));
		System.out.println((int) (1.0f + 1.5));

		String s = "abc";
		String s2 = new String("abc");
		System.out.println(4 ^ 2);


	}

	private void arithmetic() {
		int a = Integer.MAX_VALUE + 1;
		int b = 10 - 1;
		int c = 10 * 2;
		int d = 10 / 3;
		int e = 10 % 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("prefix:" + preffix());
		System.out.println("posfix:" + posfix());
	}

	private int preffix() {
		int a = 10;

		int b = ++a + 1;
		return b;

	}

	private int posfix() {
		int a = 10;

		int b = a++ + 1;
		return b;
	}

}
