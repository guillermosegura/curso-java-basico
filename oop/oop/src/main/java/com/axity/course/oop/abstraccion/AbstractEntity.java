package com.axity.course.oop.abstraccion;

import java.io.Serializable;

public abstract class AbstractEntity  implements Serializable {

 
  private static final long serialVersionUID = -7985760090114991298L;
  protected Integer id;
	protected boolean active;

	public AbstractEntity() {
		this.active = true;
	}

	public abstract boolean equals(Object object);

	public abstract int hashCode();

	public abstract String toString();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
