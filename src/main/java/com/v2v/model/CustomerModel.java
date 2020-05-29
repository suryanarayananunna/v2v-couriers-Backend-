package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerModel {

	@Id
	@Column(name="Customer_Id")
	private int Customer_Id;
	
	@Column(name="Customer_Address")
	private String Customer_Address;
	
	@Column(name="Customer_Email")
	private String Customer_Email;

	@Column(name="Customer_Mobile")
	private String Customer_Mobile;

	@Column(name="Customer_Name")
	private String Customer_Name;

	@Column(name="Customer_Password")
	private String Customer_Password;

	@Column(name="Customer_User_Name")
	private String Customer_User_Name;

	public CustomerModel() {
		super();
	}

	public CustomerModel(int customer_Id, String customer_Name, String customer_Mobile, String customer_Email,
			String customer_Address, String customer_User_Name, String customer_Password) {
		super();
		Customer_Id = customer_Id;
		Customer_Name = customer_Name;
		Customer_Mobile = customer_Mobile;
		Customer_Email = customer_Email;
		Customer_Address = customer_Address;
		Customer_User_Name = customer_User_Name;
		Customer_Password = customer_Password;
	}

	public String getCustomer_address(){
		return Customer_Address;
	}

	public String getCustomer_Address() {
		return Customer_Address;
	}

	public String getCustomer_email(){
		return Customer_Email;
	}

	public String getCustomer_Email() {
		return Customer_Email;
	}

	public int getCustomer_Id() {
		return Customer_Id;
	}

	public String getCustomer_mobile(){
		return Customer_Mobile;
	}

	public String getCustomer_Mobile() {
		return Customer_Mobile;
	}

	public String getCustomer_name(){
		return Customer_Name;
	}

	public String getCustomer_Name() {
		return Customer_Name;
	}
	public String getCustomer_password(){
		return Customer_Password;
	}
	public String getCustomer_Password() {
		return Customer_Password;
	}
	public String getCustomer_user_name(){
		return Customer_User_Name;
	}
	public String getCustomer_User_Name() {
		return Customer_User_Name;
	}
	public void setCustomer_address(String Customer_Address){
		this.Customer_Address=Customer_Address;
	}

	public void setCustomer_Address(String customer_Address) {
		Customer_Address = customer_Address;
	}

	public void setCustomer_email(String Customer_Email){
		this.Customer_Email=Customer_Email;
	}

	public void setCustomer_Email(String customer_Email) {
		Customer_Email = customer_Email;
	}

	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}

	public void setCustomer_mobile(String Customer_Mobile){
		this.Customer_Mobile=Customer_Mobile;
	}

	public void setCustomer_Mobile(String customer_Mobile) {
		Customer_Mobile = customer_Mobile;
	}

	public void setCustomer_name(String Customer_Name){
		this.Customer_Name=Customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}

	public void setCustomer_password(String Customer_Password){
		this.Customer_Password=Customer_Password;
	}

	public void setCustomer_Password(String customer_Password) {
		Customer_Password = customer_Password;
	}

	public void setCustomer_user_name(String Customer_User_Name){
		this.Customer_User_Name=Customer_User_Name;
	}

	public void setCustomer_User_Name(String customer_User_Name) {
		Customer_User_Name = customer_User_Name;
	}
}
