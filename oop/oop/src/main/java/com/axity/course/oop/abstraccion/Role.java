package com.axity.course.oop.abstraccion;

public class Role extends AbstractEntity {

	private String name;
	
	@Override
	public boolean equals(Object object) {
		boolean isEquals = false;
		if (object == this) {
			isEquals = true;
		} else if (object != null && object.getClass().equals(this.getClass())) {
			Role that = (Role) object;
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
		return sb.toString();
	}

}
