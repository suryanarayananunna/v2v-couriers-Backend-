package com.v2v.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery")
public class DeliveryModel {
	
	@Id
	@Column(name="Customer_Id")
	private int Delivery_Id;
	
	@Column(name="Delivery_Address")
	private String Delivery_Address;
	
	@Column(name="Delivery_By")
	private String Delivery_By;

	@Column(name="Delivery_Customer_Id")
	private int Delivery_Customer_Id;

	@Column(name="Delivery_Date")
	private java.util.Date Delivery_Date;

	@Column(name="Delivery_Desc")
	private String Delivery_Desc;
	
	@Column(name="Delivery_Type")
	private String Delivery_Type;

	public DeliveryModel() {
		super();
	}

	public DeliveryModel(int delivery_Id, String delivery_Address, String delivery_Desc, String delivery_Type,
			String delivery_By, Date delivery_Date, int delivery_Customer_Id) {
		super();
		Delivery_Id = delivery_Id;
		Delivery_Address = delivery_Address;
		Delivery_Desc = delivery_Desc;
		Delivery_Type = delivery_Type;
		Delivery_By = delivery_By;
		Delivery_Date = delivery_Date;
		Delivery_Customer_Id = delivery_Customer_Id;
	}

	public String getDelivery_address(){
		return Delivery_Address;
	}

	public String getDelivery_Address() {
		return Delivery_Address;
	}

	public String getDelivery_by(){
		return Delivery_By;
	}

	public String getDelivery_By() {
		return Delivery_By;
	}

	public int getDelivery_customer_id(){
		return Delivery_Customer_Id;
	}

	public int getDelivery_Customer_Id() {
		return Delivery_Customer_Id;
	}

	public java.util.Date getDelivery_date(){
		return Delivery_Date;
	}

	public java.util.Date getDelivery_Date() {
		return Delivery_Date;
	}

	public String getDelivery_desc(){
		return Delivery_Desc;
	}
	public String getDelivery_Desc() {
		return Delivery_Desc;
	}
	public int getDelivery_Id() {
		return Delivery_Id;
	}
	public String getDelivery_type(){
		return Delivery_Type;
	}
	public String getDelivery_Type() {
		return Delivery_Type;
	}
	public void setDelivery_address(String Delivery_Address){
		this.Delivery_Address=Delivery_Address;
	}

	public void setDelivery_Address(String delivery_Address) {
		Delivery_Address = delivery_Address;
	}

	public void setDelivery_by(String Delivery_By){
		this.Delivery_By=Delivery_By;
	}

	public void setDelivery_By(String delivery_By) {
		Delivery_By = delivery_By;
	}

	public void setDelivery_customer_id(int Delivery_Customer_Id){
		this.Delivery_Customer_Id=Delivery_Customer_Id;
	}

	public void setDelivery_Customer_Id(int delivery_Customer_Id) {
		Delivery_Customer_Id = delivery_Customer_Id;
	}

	public void setDelivery_date(java.util.Date Delivery_Date){
		this.Delivery_Date=Delivery_Date;
	}

	public void setDelivery_Date(java.util.Date delivery_Date) {
		Delivery_Date = delivery_Date;
	}

	public void setDelivery_desc(String Delivery_Desc){
		this.Delivery_Desc=Delivery_Desc;
	}

	public void setDelivery_Desc(String delivery_Desc) {
		Delivery_Desc = delivery_Desc;
	}

	public void setDelivery_Id(int delivery_Id) {
		Delivery_Id = delivery_Id;
	}

	public void setDelivery_type(String Delivery_Type){
		this.Delivery_Type=Delivery_Type;
	}

	public void setDelivery_Type(String delivery_Type) {
		Delivery_Type = delivery_Type;
	}
}
