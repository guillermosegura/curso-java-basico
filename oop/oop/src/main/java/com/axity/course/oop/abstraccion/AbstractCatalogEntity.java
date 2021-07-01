package com.axity.course.oop.abstraccion;

public abstract class AbstractCatalogEntity extends AbstractEntity {

	protected String code;
	protected String name;
	protected String description;
	
	
	public abstract boolean equals(Object object);

	public abstract int hashCode();

	public abstract String toString();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
