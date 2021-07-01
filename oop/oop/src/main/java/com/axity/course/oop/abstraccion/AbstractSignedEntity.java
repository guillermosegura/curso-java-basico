package com.axity.course.oop.abstraccion;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class AbstractSignedEntity extends AbstractEntity {
 
  private static final long serialVersionUID = 6433857022078538824L;
  protected String userLastModification;
	protected Date lasModification;

	public AbstractSignedEntity() {
		super();
	}

	public abstract boolean equals(Object object);

	public abstract int hashCode();

	public abstract String toString();

	public String getUserLastModification() {
		return userLastModification;
	}

	public void setUserLastModification(String userLastModification) {
		this.userLastModification = userLastModification;
	}

	public Date getLasModification() {
		return lasModification != null ? (Date) lasModification.clone() : null;
	}

	public void setLasModification(Date lasModification) {
		this.lasModification = lasModification != null ? (Date) lasModification.clone() : null;
	}

	protected String getLasModificationFormated() {
		String str = null;
		if (this.lasModification != null) {
			LocalDateTime localDateTime = LocalDateTime.ofInstant(this.lasModification.toInstant(),
					ZoneId.systemDefault());
			str = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		}
		return str;
	}
}
