package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductModel {
	
	
	@Id
	@Column(name="Product_Id")
	public int Product_Id;

	@Column(name="Product_Desc")
	private String Product_Desc;

	
	@Column(name="Product_Name")
	private String Product_Name;
	
	@Column(name="Product_Price")
	private int Product_Price;
	
	

	public ProductModel() {
		super();
	}

	public ProductModel(String product_Desc, int product_Id, String product_Name, int product_Price) {
		super();
		Product_Desc = product_Desc;
		Product_Id = product_Id;
		Product_Name = product_Name;
		Product_Price = product_Price;
	}

	public String getProduct_desc(){
		return Product_Desc;
	}

	public String getProduct_Desc() {
		return Product_Desc;
	}

	public int getProduct_Id() {
		return Product_Id;
	}

	public String getProduct_name(){
		return Product_Name;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public int getProduct_price(){
		return Product_Price;
	}

	public int getProduct_Price() {
		return Product_Price;
	}

	public void setProduct_desc(String Product_Desc){
		this.Product_Desc=Product_Desc;
	}

	public void setProduct_Desc(String product_Desc) {
		Product_Desc = product_Desc;
	}

	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}

	public void setProduct_name(String Product_Name){
		this.Product_Name=Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public void setProduct_price(int Product_Price){
		this.Product_Price=Product_Price;
	}

	public void setProduct_Price(int product_Price) {
		Product_Price = product_Price;
	}
	
}
