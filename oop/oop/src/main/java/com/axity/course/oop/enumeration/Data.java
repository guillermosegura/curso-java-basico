package com.axity.course.oop.enumeration;

public enum Data implements GetId, GetData {

	ALFA(1, "\u03B1"), BETA(2, "\u03B2"), GAMMA(3, "\u03B3"), DELTA(4, "\u03B4");

	private String data;
	private int id;

	private Data(int id, String data) {
		this.id = id;
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public int getId() {
		return id;
	}

	public static Data fromId(int id) {
		Data value = null;
		for (Data data : values()) {
			if (data.id == id) {
				value = data;
				break;
			}
		}
		return value;
	}

}
