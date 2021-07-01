package com.axity.course.sentencias;

import com.axity.course.sintaxis.Student;

public class WhileApp {

	public static void main(String[] args) {
		WhileApp app = new WhileApp();
		// app.simpleWhile(0);
		// app.whileContinue(100);
		// app.whileBreak(100);
		// app.whileBreak2(100);

		// app.doWhile(10);
		//app.doWhileBreakContinue(100);
		app.for2();
	}

	private void simpleWhile(int n) {
		while (n > 0) {
			System.out.println("while n:" + n);
			n--;
		}

	}

	private void whileBreak(int n) {
		while (n > 0) {
			System.out.println("n:" + n);
			if (n % 7 == 0) {
				break;
			}
			n--;
		}

	}

	private void whileBreak2(int n) {
		while (true) {
			System.out.println("n:" + n);
			if (n % 7 == 0) {
				break;
			}
			n--;
		}
	}

	private void whileContinue(int n) {
		int i = 1;
		while (n > 0) {
			if (i == 5) {
				System.out.println(n);
				i = 1;
				n--;
				continue;
			} else {
				System.out.print(n + "\t");
				i++;
				n--;
			}

		}

	}

	private void doWhile(int n) {
		Student s;
		do {
			s = new Student("name" + n, "app", 20);
			System.out.println("doWhile: n:" + n);
			n--;
			s = null;
		} while (n > 0);

		System.out.println(s);
	}

	private void doWhileBreakContinue(int n) {
		int i = 0;
		do {
//			n--;
//			i++;

			if (i > 20) {
				System.out.println("\nLímite de ejecuciones");
				break;
			}

			if (++i % 5 == 0) {
				System.out.println(n);
				continue;
			}
			System.out.print(n + "\t");

		} while (n-- > 0);
	}

//	int a, b,c = 1, d, e;
	private void for2() {
		int a=0, b=0,c = 1, d=0, e=0;
		
		
		for (int i = 0, j = 0, k = 0; i < 10; i++, j++, k++) {
			System.out.println(i + ", " + j + ", " + k);
			a++;
			if (j++ == 2) {
				a++;
				b++;
			}else {
				c++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
