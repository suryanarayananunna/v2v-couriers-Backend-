package com.v2v.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel{
	

	@Id
	@Column(name="User_Id")
	public int User_Id;
	
	@Column(name="User_Address")
	private String User_Address;
	
	@Column(name="User_Dob")
	private java.util.Date User_Dob;

	@Column(name="User_Email")
	private String User_Email;

	
	@Column(name="User_Name")
	private String User_Name;
	
	@Column(name="User_Role_Id")
	private int User_Role_Id;

	public UserModel() {
		super();
	}

	public UserModel(int user_Id,int user_Role_Id, String user_Name, String user_Email, Date user_Dob, String user_Address) {
		super();
		User_Id = user_Id;
		User_Role_Id = user_Role_Id;
		User_Name = user_Name;
		User_Email = user_Email;
		User_Dob = user_Dob;
		User_Address = user_Address;
	}

	public String getUser_address(){
		return User_Address;
	}

	public String getUser_Address() {
		return User_Address;
	}

	public java.util.Date getUser_dob(){
		return User_Dob;
	}

	public UserModel(String user_Address, Date user_Dob, String user_Email, int user_Id, String user_Name,
			int user_Role_Id) {
		super();
		User_Address = user_Address;
		User_Dob = user_Dob;
		User_Email = user_Email;
		User_Id = user_Id;
		User_Name = user_Name;
		User_Role_Id = user_Role_Id;
	}

	public java.util.Date getUser_Dob() {
		return User_Dob;
	}

	public String getUser_email(){
		return User_Email;
	}

	public String getUser_Email() {
		return User_Email;
	}

	public int getUser_Id() {
		return User_Id;
	}

	public String getUser_name(){
		return User_Name;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public int getUser_role_id(){
		return User_Role_Id;
	}

	

	public int getUser_Role_Id() {
		return User_Role_Id;
	}

	public void setUser_address(String User_Address){
		this.User_Address=User_Address;
	}
	
	public void setUser_Address(String user_Address) {
		User_Address = user_Address;
	}
	
	public void setUser_dob(java.util.Date User_Dob){
		this.User_Dob=User_Dob;
	}

	public void setUser_Dob(java.util.Date user_Dob) {
		User_Dob = user_Dob;
	}

	public void setUser_email(String User_Email){
		this.User_Email=User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}

	public void setUser_name(String User_Name){
		this.User_Name=User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public void setUser_role_id(int User_Role_Id){
		this.User_Role_Id=User_Role_Id;
	}

	public void setUser_Role_Id(int user_Role_Id) {
		User_Role_Id = user_Role_Id;
	}
}