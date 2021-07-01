package com.axity.course.oop.abstraccion;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

public class User extends AbstractSignedEntity {
 
  private static final long serialVersionUID = 1784382534415601557L;
  private String username;
	private String email;
	private List<Role> roles;

	public User() {
		super();
		roles = new ArrayList<>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public boolean equals(Object object) {
		boolean isEquals = false;
		if (object == this) {
			isEquals = true;
		} else if (object != null && object.getClass().equals(this.getClass())) {
			User that = (User) object;
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
		sb.append(", username:").append(this.username);
		sb.append(", email:").append(this.email);
		sb.append(", lasModification:").append(getLasModificationFormated());
		sb.append(", userLastModification:").append(this.userLastModification);
		sb.append(", active:").append(this.active);
		
		return sb.toString();
	}

}
