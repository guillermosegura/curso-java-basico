package com.axity.course.ejercicios;

import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {
		Ejercicio1 ej = new Ejercicio1();

		int n = 7;
//		ej.triangulo(n);

		n = 100;
		int[][] data = ej.generaArreglo(n);
		for (int[] vector : data) {
			for (int valor : vector) {
				System.out.print(valor + ", ");
			}
			System.out.println();
		}
	}

	private int[][] generaArreglo(int n) {
		int[][] data = new int[10][];

		int[] aleatorios = new int[n];
		int[] contadores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < n; i++) {
			int valor = (int) (Math.random() * 100);
			aleatorios[i] = valor;

			int index = valor / 10;
			contadores[index]++;
		}
		for (int i = 0; i < contadores.length; i++) {
			int contador = contadores[i];
			data[i] = new int[contador];
		}

		Arrays.fill(contadores, 0);
		for (int i =0; i <aleatorios.length; i++) {
			int index = aleatorios[i] / 10;
			int j = contadores[index];
			
			data[index][j] = aleatorios[i];
			contadores[index]++;
		}
		return data;
	}

	private void triangulo(int n) {
		if (n <= 0 || n % 2 == 0) {
			System.out.println("Número inválido");
		} else {
			for (int i = 1, espacio = n / 2; i <= n; i += 2, espacio--) {

				for (int j = 0; j < espacio; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
