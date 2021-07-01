package com.axity.course.sintaxis;

import java.util.Arrays;

public class ArrayApp {

	public static void main(String[] args) {
		
		Student[] eee = { new Student("Juan", "Perez", 20), new Student("Ana", "Sanchez", 21)};
//		System.out.println(eee);
		System.out.println(Arrays.toString(eee));
		
		
 
		int[][] bidimensional = { { 1, 2 }, { 3, 4 } };

		int[][][] tridimensional = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } }, { { 10, 11 }, { 12, 13 } },
				{ { 14, 15 }, { 16, 17 } } };

		int[][][][][][][][][][] ndimensional;

		int[] enteros = { 1, 2, 3 };

		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}

		for (int valor : enteros) {
			System.out.println(valor);
		}

		System.out.println("--------------");
		bidimensional[0] = new int[] { 9, 10, 11, 12 };
		for (int[] ndim : bidimensional) {
			for (int valor : ndim) {
				System.out.println(valor);
			}
		}
		System.out.println("--------------");	
		int[] data = { 7, 5, 1, 6, 8, 9, 10, 3};

 
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		Arrays.asList(data);
		
		int[] data1 = new int[5];
		Arrays.fill(data1, 100);
		for (int a: data1) {
			System.out.println(a);
		}
		System.out.println("copy ");
		System.out.println("-------------");
		System.out.println(Arrays.toString(data));
		int[] otraData = Arrays.copyOf(data, 5);
		System.out.println(Arrays.toString(otraData));
		
		otraData = Arrays.copyOf(data, 10);
		System.out.println(Arrays.toString(otraData));
		
		data = new int[] { 7, 5, 1, 6, 8, 9, 10, 3};
		Arrays.parallelSort(data);
		System.out.println(Arrays.toString(data));
		
		System.out.println("--------------");	
		//data = new int[] { 7, 5, 1, 6, 8, 9, 10, 3};
		System.out.println( Arrays.binarySearch(data, 9));
		System.out.println( Arrays.binarySearch(data, 12));
	}

}
