package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginModel {

	@Id
	@Column(name="Login_id")
	private int Login_id;
	
	@Column(name="Login_Role_Id")
	private int Login_Role_Id;

	@Column(name="Login_User_Name")
	private String Login_User_Name;

	@Column(name="Login_User_Password")
	private String Login_User_Password;

	public LoginModel() {
		super();
	}

	public LoginModel(int login_id, int login_Role_Id, String login_User_Name, String login_User_Password) {
		super();
		Login_id = login_id;
		Login_Role_Id = login_Role_Id;
		Login_User_Name = login_User_Name;
		Login_User_Password = login_User_Password;
	}

	public int getLogin_id() {
		return Login_id;
	}

	public int getLogin_role_id(){
		return Login_Role_Id;
	}

	public int getLogin_Role_Id() {
		return Login_Role_Id;
	}

	public String getLogin_user_name(){
		return Login_User_Name;
	}

	public String getLogin_User_Name() {
		return Login_User_Name;
	}

	public String getLogin_user_password(){
		return Login_User_Password;
	}
	public String getLogin_User_Password() {
		return Login_User_Password;
	}
	public void setLogin_id(int login_id) {
		Login_id = login_id;
	}

	public void setLogin_role_id(int Login_Role_Id){
		this.Login_Role_Id=Login_Role_Id;
	}

	public void setLogin_Role_Id(int login_Role_Id) {
		Login_Role_Id = login_Role_Id;
	}

	public void setLogin_user_name(String Login_User_Name){
		this.Login_User_Name=Login_User_Name;
	}

	public void setLogin_User_Name(String login_User_Name) {
		Login_User_Name = login_User_Name;
	}

	public void setLogin_user_password(String Login_User_Password){
		this.Login_User_Password=Login_User_Password;
	}

	public void setLogin_User_Password(String login_User_Password) {
		Login_User_Password = login_User_Password;
	}
	
}
