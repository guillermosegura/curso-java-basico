package com.axity.course.oop.annotations;

import java.io.Serializable;
import java.util.UUID;

public class D implements Serializable {
 
	private static final long serialVersionUID = 7706503226868665724L;

	@SuppressWarnings("unused")
	private Long  id;

	private String uuid;

	public D() {
		this.uuid = UUID.randomUUID().toString();
	}

	@Deprecated
	public void oldMethod() {
		System.out.println("Ya no se debe utilizar");
	}

	@Override
	public String toString() {
		return this.uuid;
	}
}
