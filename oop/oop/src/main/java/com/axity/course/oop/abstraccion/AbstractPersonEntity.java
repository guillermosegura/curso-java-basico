package com.axity.course.oop.abstraccion;

public abstract class AbstractPersonEntity extends AbstractSignedEntity {

	protected String name;
	protected String lastname;

	public AbstractPersonEntity() {
		super();
	}

	public abstract boolean equals(Object object);

	public abstract int hashCode();

	public abstract String toString();

	public String getUserLastModification() {
		return userLastModification;
	}

}
