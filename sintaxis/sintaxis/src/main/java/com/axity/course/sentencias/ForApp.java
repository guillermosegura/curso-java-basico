package com.axity.course.sentencias;

public class ForApp {

	public static void main(String[] args) {

		ForApp app = new ForApp();
		// app.forArray1D();
		// app.forArray2D();
//
//		app.forEachArray1D();
//		app.forEachArray2D();

//		app.forContinue();
//		 app.forBreak();

		for (int i = -1; i < 10; i++) {
			app.triangle(i);
			System.out.println();
		}

	}

	private void triangle(int n) {

		if (n % 2 == 0) {
			// System.out.println("Es par");
		} else if (n <= 0) {
			System.out.println("Número inválido");
		} else {
			System.out.println("n = " + n);
			// -... ¿q va a aqui?

			for (int base = n, espacio=1; base > 0; base -= 2, espacio++) {
				for(int i = 0; i < espacio;i++) {
					System.out.print(" ");
				}
				for (int i = 1; i <= base; i++) {
					System.out.print("*");
				}
				System.out.println();

			}

		}
	}

	private void forContinue() {
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				continue;
			}
			System.out.print(i + "\t");
		}

	}

	private void forBreak() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int valor : array) {
			if (valor % 5 == 0) {
				break;
			}
			System.out.println(valor);
		}

	}

	private void forArray1D() {
		int[] array = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private void forEachArray1D() {
		int[] array = { 1, 2, 3, 4, 5 };

		for (int valor : array) {
			System.out.println(valor);
		}

	}

	private void forArray2D() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6, 9, 10, 7, }, { 7, 8, 9, 10, 11 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private void forEachArray2D() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int i = 0;
		for (int[] vector : matrix) {
			int j = 0;
			for (int valor : vector) {
				System.out.print(valor + "\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
