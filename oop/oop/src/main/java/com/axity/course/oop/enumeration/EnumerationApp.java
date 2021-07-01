package com.axity.course.oop.enumeration;

public class EnumerationApp {

	public static void main(String[] args) {
		EnumerationApp app = new EnumerationApp();

		
		for (A a : A.values()) {
			app.revisa(a);
		}

		for (B b : B.values()) {
			app.revisa(b);
		}

		for (Data data : Data.values()) {
			app.revisa(data);
		}

//		app.doSomething(Data.ALFA);
//		app.doSomething(Data.BETA);
//		app.doSomething(Data.GAMMA);
//		app.doSomething(Data.DELTA);
//
//		for (Data data : Data.values()) {
//			System.out.println(
//					data.name() + ", " + data.getData() + ", ordinal: " + data.ordinal() + ", id: " + data.getId());
//		}
//		System.out.println("-----");
//		Data data = Data.fromId(3);
//		System.out.println(data);

	}

	private void doSomething(Data data) {
		switch (data) {
		case ALFA:
		case BETA:
			System.out.println(data.getData());
			break;
		default:
			System.out.println("No habilitado");
		}
	}

	private int getId(GetId getId) {
		return getId.getId();
	}

	private void revisa(Object o) {

		if (o instanceof GetId && o instanceof GetData) {
			System.out.println(((GetId) o).name() + ": " + ((GetId) o).getId() + "-" + ((GetData) o).getData());
		} else if (o instanceof GetId) {
			System.out.println(((GetId) o).name() + ": " + ((GetId) o).getId());
		} else if (o instanceof GetData) {
			System.out.println(((GetData) o).name() + ": " + ((GetData) o).getData());
		}

	}
}
