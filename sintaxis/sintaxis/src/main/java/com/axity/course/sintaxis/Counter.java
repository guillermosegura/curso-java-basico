package com.axity.course.sintaxis;

public class Counter {

	private int counter; // Variable-atributo contador

	public static void main(String args[]) {
		// Se define la variable counter en el método main
		Counter counter = new Counter();

		counter.showCounter();
		counter.next();
		counter.next();
		counter.next();
		counter.showCounter();

		// Variable n = 5
		int n = 5;
		counter.add(n);
		counter.showCounter();

		// Variable n = 2
		n = 2;
		counter.add(n);

		counter.showCounter();

		// Variable pair = 5
		int pair = 3;
		counter.addDouble(pair);
		counter.showCounter();

	}

	public void next() {
		// Incrementa el valor de counter de la clase
		this.counter++;
	}

	public void add(int n) {
		// Incrementa el valor de counter de la clase con el valor del parámetro n
		this.counter += n;
	}

	public void addDouble(int n) {
		// Incrementa el valor de counter de la clase con el valor del parámetro n * 2
		// Asigna el valor de la multiplicación a la variable pair
		int pair = n * 2;
		this.counter += pair;
	}

	public void showCounter() {
		System.out.println("Contador: " + this.counter);
	}

}
