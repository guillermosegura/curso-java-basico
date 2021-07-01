package com.axity.course.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		Ejercicio2 ej = new Ejercicio2();

		int[][] data = ej.generaArreglo(1000);
		ej.estadisticas(data);
	}

	private void estadisticas(int[][] data) {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			int cantidad = data[i].length;
			int rangoInicial = i * 10;
			int rangoFinal = i * 10 + 9;

			String str = "[" + rangoInicial + "-" + rangoFinal + "]";

			str += " cantidad = " + cantidad;

			int suma = 0;
			double avg = 0.0;
			for (int j = 0; j < data[i].length; j++) {
				suma += data[i][j];
			}

			str += ", suma = " + suma;

			if (cantidad != 0) {
				avg = (double) suma / cantidad;
				str += ", promedio = " + String.format("%.2f", avg);
			}

			System.out.println(str);
			total += cantidad;
		}
		System.out.println("Total = " + total);
	}

	private int[][] generaArreglo(int n) {

		int[] aleatorios = new int[n];
		int[] grupos = new int[10];
		int[] indexGrupos = new int[10];
		for (int i = 0; i < n; i++) {
			int rint = (int) (Math.random() * 100);
			int grupo = rint / 10;
			grupos[grupo]++;
			aleatorios[i] = rint;
		}

		int[][] data = new int[10][];
		// Inicializa el arreglo de data
		for (int i = 0; i < data.length; i++) {
			data[i] = new int[grupos[i]];
		}
		for (int i = 0; i < aleatorios.length; i++) {
			int rint = aleatorios[i];
			int grupo = rint / 10;

			data[grupo][indexGrupos[grupo]] = rint;

			indexGrupos[grupo]++;
		}

		return data;
	}

}
