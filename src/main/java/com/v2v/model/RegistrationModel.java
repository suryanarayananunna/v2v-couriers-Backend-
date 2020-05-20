package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class RegistrationModel {
	
	@Id
	@Column(name="User_Name")
	public String UserName;
	
	@Column(name="Email")
	public String Email;
	
	@Column(name="Password")
	public String Password;
	
	@Column(name="Role")
	public String Role;
	
	public RegistrationModel(String Username, String email, String password, String role) {
		super();
		this.UserName = Username;
		this.Email = email;
		this.Password = password;
		this.Role = role;
	}
	
	public RegistrationModel() {}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		this.Role = role;
	}
	

}
