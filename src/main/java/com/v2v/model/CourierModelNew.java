package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courier1")
public class CourierModelNew {
	
	@Id
	@Column(name="Courier_Id")
	private int Courier_id;
	
	@Column(name="Courier_Current_Location")
	private String Courier_Current_Location;
	
	@Column(name="Courier_Customer_Id")
	private int Courier_Customer_Id;

	@Column(name="Courier_Deli_Id")
	private int Courier_Deli_Id;

	@Column(name="Courier_Desc")
	private String Courier_Desc;

	@Column(name="Courier_Name")
	private String Courier_Name;

	@Column(name="Courier_Product_Id")
	private int Courier_Product_Id;

	@Column(name="Courier_Type")
	private String Courier_Type;

	public CourierModelNew() {
		super();
	}

	public CourierModelNew(int courier_id, String courier_Name, String courier_Desc, String courier_Type,
			int courier_Product_Id, int courier_Customer_Id, String courier_Current_Location, int courier_Deli_Id) {
		super();
		Courier_id = courier_id;
		Courier_Name = courier_Name;
		Courier_Desc = courier_Desc;
		Courier_Type = courier_Type;
		Courier_Product_Id = courier_Product_Id;
		Courier_Customer_Id = courier_Customer_Id;
		Courier_Current_Location = courier_Current_Location;
		Courier_Deli_Id = courier_Deli_Id;
	}

	public String getCourier_current_location(){
		return Courier_Current_Location;
	}

	public String getCourier_Current_Location() {
		return Courier_Current_Location;
	}

	public int getCourier_customer_id(){
		return Courier_Customer_Id;
	}

	public int getCourier_Customer_Id() {
		return Courier_Customer_Id;
	}

	public int getCourier_deli_id(){
		return Courier_Deli_Id;
	}

	public int getCourier_Deli_Id() {
		return Courier_Deli_Id;
	}

	public String getCourier_desc(){
		return Courier_Desc;
	}

	public String getCourier_Desc() {
		return Courier_Desc;
	}

	public int getCourier_id() {
		return Courier_id;
	}

	public String getCourier_name(){
		return Courier_Name;
	}
	public String getCourier_Name() {
		return Courier_Name;
	}
	public int getCourier_product_id(){
		return Courier_Product_Id;
	}
	public int getCourier_Product_Id() {
		return Courier_Product_Id;
	}
	public String getCourier_type(){
		return Courier_Type;
	}
	public String getCourier_Type() {
		return Courier_Type;
	}
	public void setCourier_current_location(String Courier_Current_Location){
		this.Courier_Current_Location=Courier_Current_Location;
	}

	public void setCourier_Current_Location(String courier_Current_Location) {
		Courier_Current_Location = courier_Current_Location;
	}

	public void setCourier_customer_id(int Courier_Customer_Id){
		this.Courier_Customer_Id=Courier_Customer_Id;
	}

	public void setCourier_Customer_Id(int courier_Customer_Id) {
		Courier_Customer_Id = courier_Customer_Id;
	}

	public void setCourier_deli_id(int Courier_Deli_Id){
		this.Courier_Deli_Id=Courier_Deli_Id;
	}

	public void setCourier_Deli_Id(int courier_Deli_Id) {
		Courier_Deli_Id = courier_Deli_Id;
	}

	public void setCourier_desc(String Courier_Desc){
		this.Courier_Desc=Courier_Desc;
	}

	public void setCourier_Desc(String courier_Desc) {
		Courier_Desc = courier_Desc;
	}

	public void setCourier_id(int courier_id) {
		Courier_id = courier_id;
	}

	public void setCourier_name(String Courier_Name){
		this.Courier_Name=Courier_Name;
	}

	public void setCourier_Name(String courier_Name) {
		Courier_Name = courier_Name;
	}

	public void setCourier_product_id(int Courier_Product_Id){
		this.Courier_Product_Id=Courier_Product_Id;
	}

	public void setCourier_Product_Id(int courier_Product_Id) {
		Courier_Product_Id = courier_Product_Id;
	}

	public void setCourier_type(String Courier_Type){
		this.Courier_Type=Courier_Type;
	}

	public void setCourier_Type(String courier_Type) {
		Courier_Type = courier_Type;
	}
}
