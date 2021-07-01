package com.axity.course.sentencias;

public class SwitchApp {

	private enum COLOR {
		RED, BLUE, GREEN
	};

	public static void main(String[] args) {
		SwitchApp app = new SwitchApp();
		app.switchChar('a');
		app.switchChar('b');
		app.switchChar('c');
		app.switchChar('d');
	
		System.out.println("===========");
		app.switchInt(1);
		app.switchInt(2);
		app.switchInt(3);
		app.switchInt(4);
	
		System.out.println("===========");
		app.switchString("ABC");
		app.switchString("abc");
		app.switchString("aBC");
		app.switchString("abC");
	
		System.out.println("===========");
		app.switchColor(COLOR.RED);
		app.switchColor(COLOR.GREEN);
		app.switchColor(COLOR.BLUE);
		
		
		System.out.println("===========");
		app.switchGrouped(1);
		app.switchGrouped(2);
		app.switchGrouped(3);
		app.switchGrouped(4);
		app.switchGrouped(5);
		app.switchGrouped(6);
	
	}

	private void switchChar(char c) {

		switch (c) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		default:
			System.out.println("Otra letra");
		}
	}

	private void switchInt(int n) {
		switch (n) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("Otro número");
		}
	}

	private void switchString(String str) {
		// Es Case Sensitive
		switch (str) {
		case "ABC":
			System.out.println("Opción 1");
			break;
		case "abc":
			System.out.println("Opción 2");
			break;
		case "aBC":
			System.out.println("Opción 3");
			break;
		default:
			System.out.println("Otra opción");
		}
	}

	private void switchColor(COLOR color) {
		switch (color) {
		case RED:
			System.out.println("Rojo");
			break;
		case BLUE:
			System.out.println("Azul");
			break;
		case GREEN:
			System.out.println("Verde");
			break;
		default:
			System.out.println("Color inválido");
		}
	}

	private void switchGrouped(int n) {
		switch (n) {
		case 1:
		case 2:
		case 3:
			doSomething1();
			break;
		case 4:
		case 5:
			doSomething2();
			break;
		default:
			doSomethingElse();
		}
	}
	
	private void doSomething1() {
		System.out.println("Do something 1");

	}

	private void doSomething2() {
		System.out.println("Do something 2");

	}

	private void doSomethingElse() {
		System.out.println("Do something else");

	}
}
