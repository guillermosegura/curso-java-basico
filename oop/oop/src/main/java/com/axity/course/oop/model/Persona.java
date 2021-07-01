package com.axity.course.oop.model;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = 6033127423266502002L;
	protected String name;
	protected String lastname;
	protected String rfc;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

}
