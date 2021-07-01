package com.axity.course.oop.abstraccion;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

public class Student extends AbstractPersonEntity {

	private String registrationNumber;

	public Student() {
		super();
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public boolean equals(Object object) {
		boolean isEquals = false;
		if (object == this) {
			isEquals = true;
		} else if (object != null && object.getClass().equals(this.getClass())) {
			Student that = (Student) object;
			if (this.id != null) {
				isEquals = this.id.equals(that.id);
			}
		}

		return isEquals;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		if (this.id != null) {
			hash = this.id.hashCode();
		}
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:").append(this.id);
		sb.append(", name:").append(this.name);
		sb.append(", lastname:").append(this.lastname);
		sb.append(", registrationNumber:").append(this.registrationNumber);
		sb.append(", lasModification:").append(getLasModificationFormated());
		sb.append(", userLastModification:").append(this.userLastModification);
		sb.append(", active:").append(this.active);

		return sb.toString();
	}

}
