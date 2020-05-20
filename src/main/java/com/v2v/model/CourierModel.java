package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courier")
public class CourierModel {
	
	@Id
	@Column(name="Courier_Id")
	public String CourierId;
	
	@Column(name="Courier_Name")
    public String CourierName;
	
	@Column(name="Courier_Description")
    public String CourierDescription;
	
	@Column(name="Courier_Type")
   	public String CourierType;
	
	@Column(name="Courier_Product_Id")
    public String CourierProductId;
	
	@Column(name="Courier_Customer_Id")
    public String CourierCustomerId;
    
    
	public CourierModel() {
		super();
	}
    
    public CourierModel(String courierId, String courierName, String courierDescription, String courierProductId,
			String courierCustomerId,String courierType) {
		super();
		CourierId = courierId;
		CourierName = courierName;
		CourierDescription = courierDescription;
		CourierProductId = courierProductId;
		CourierCustomerId = courierCustomerId;
		CourierType = courierType;
	}
    
     
	public String getCourierId() {
		return CourierId;
	}
	public void setCourierId(String courierId) {
		CourierId = courierId;
	}
	public String getCourierName() {
		return CourierName;
	}
	public void setCourierName(String courierName) {
		CourierName = courierName;
	}
	public String getCourierDescription() {
		return CourierDescription;
	}
	public void setCourierDescription(String courierDescription) {
		CourierDescription = courierDescription;
	}
	public String getCourierProductId() {
		return CourierProductId;
	}
	public void setCourierProductId(String courierProductId) {
		CourierProductId = courierProductId;
	}
	public String getCourierCustomerId() {
		return CourierCustomerId;
	}
	public void setCourierCustomerId(String courierCustomerId) {
		CourierCustomerId = courierCustomerId;
	}

	 public String getCourierType() {
			return CourierType;
		}

		public void setCourierType(String courierType) {
			CourierType = courierType;
		}

}
