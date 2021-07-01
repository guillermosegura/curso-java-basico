package com.axity.course.sintaxis;

public class A {
	private int id;
	private String name;
	private boolean active;

	private static final int A = 1;
	private static final int B = 2;

	public A() {
		System.out.println("default noarg");
	}

	public A(int id) {
		this();
		System.out.println("Por id");
		this.id = id;
	}

	public A(int id, String name) {
		this(id);
		System.out.println("Por id, name");

		this.name = name;
	}

	public A(int id, String name, boolean active) {
		this(id, name);
		System.out.println("Por id, name, active");

		this.active = active;
	}

	public String toString() {
		return "id = " + this.id + ", name = " + this.name + ", active = " + this.active;
	}

	public int suma(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A(2);
		A a3 = new A(3, "Juan");
		A a4 = new A(4, "Maria", true);
		System.out.println("a1:" + a1);
		System.out.println("a1:" + a2);
		System.out.println("a1:" + a3);
		System.out.println("a1:" + a4);

		String sql = "SELECT t.ID, t.NAME, t.WHATEVER, t2.DEMO, t2.LASTNAME " //
				+ " FROM TABLE t  " //
				+ " INNER JOIN TABLE2 t2 " //
				+ "    ON t2.ID_WASHU_WASHU = t._WASHU_WASHU " //
				+ " WHERE T.WHATEVER = ? ";

	}
}
