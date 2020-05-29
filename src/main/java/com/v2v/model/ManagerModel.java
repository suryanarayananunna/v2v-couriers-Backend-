package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class ManagerModel {
	
	@Id
	@Column(name="Manager_Id")
	private int Manager_Id;
	
	@Column(name="Manager_Address")
	private String Manager_Address;
	
	@Column(name="Manager_Email")
	private String Manager_Email;

	@Column(name="Manager_Mobile")
	private String Manager_Mobile;
	
	@Column(name="Manager_Name")
	private String Manager_Name;
	
	@Column(name="Manager_Password")
	private String Manager_Password;
	
	@Column(name="Manager_User_Name")
	private String Manager_User_Name;

	public ManagerModel() {
		super();
	}

	public ManagerModel(int manager_Id, String manager_Address, String manager_Name, String manager_Mobile,
			String manager_Email, String manager_User_Name, String manager_Password) {
		super();
		Manager_Id = manager_Id;
		Manager_Address = manager_Address;
		Manager_Name = manager_Name;
		Manager_Mobile = manager_Mobile;
		Manager_Email = manager_Email;
		Manager_User_Name = manager_User_Name;
		Manager_Password = manager_Password;
	}

	public String getManager_address(){
		return Manager_Address;
	}

	public String getManager_Address() {
		return Manager_Address;
	}

	public String getManager_email(){
		return Manager_Email;
	}

	public String getManager_Email() {
		return Manager_Email;
	}

	public int getManager_Id() {
		return Manager_Id;
	}

	public String getManager_mobile(){
		return Manager_Mobile;
	}

	public String getManager_Mobile() {
		return Manager_Mobile;
	}

	public String getManager_name(){
		return Manager_Name;
	}

	public String getManager_Name() {
		return Manager_Name;
	}

	public String getManager_password(){
		return Manager_Password;
	}

	public String getManager_Password() {
		return Manager_Password;
	}

	public String getManager_user_name(){
		return Manager_User_Name;
	}

	public String getManager_User_Name() {
		return Manager_User_Name;
	}

	public void setManager_address(String Manager_Address){
		this.Manager_Address=Manager_Address;
	}

	public void setManager_Address(String manager_Address) {
		Manager_Address = manager_Address;
	}

	public void setManager_email(String Manager_Email){
		this.Manager_Email=Manager_Email;
	}

	public void setManager_Email(String manager_Email) {
		Manager_Email = manager_Email;
	}

	public void setManager_Id(int manager_Id) {
		Manager_Id = manager_Id;
	}

	public void setManager_mobile(String Manager_Mobile){
		this.Manager_Mobile=Manager_Mobile;
	}

	public void setManager_Mobile(String manager_Mobile) {
		Manager_Mobile = manager_Mobile;
	}

	public void setManager_name(String Manager_Name){
		this.Manager_Name=Manager_Name;
	}

	public void setManager_Name(String manager_Name) {
		Manager_Name = manager_Name;
	}

	public void setManager_password(String Manager_Password){
		this.Manager_Password=Manager_Password;
	}

	public void setManager_Password(String manager_Password) {
		Manager_Password = manager_Password;
	}

	public void setManager_user_name(String Manager_User_Name){
		this.Manager_User_Name=Manager_User_Name;
	}

	public void setManager_User_Name(String manager_User_Name) {
		Manager_User_Name = manager_User_Name;
	}
}
