package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "office")
public class OfficeModel {
	
	@Id
	@Column(name="Office_Id")
	private int Office_Id;
	
	@Column(name="Office_Company_Id")
	private int Office_Company_Id;
	
	@Column(name="Office_Desc")
	private String Office_Desc;
	
	@Column(name="Office_Employee_Id")
	private int Office_Employee_Id;

	
	@Column(name="Office_Name")
	private String Office_Name;
	
	@Column(name="Office_Place")
	private String Office_Place;
	
	@Column(name="Office_Type")
	private String Office_Type;

	public OfficeModel() {
		super();
	}

	public OfficeModel(int office_Employee_Id, String office_Type, String office_Name, String office_Desc,
			String office_Place, int office_Company_Id, int office_Id) {
		super();
		Office_Employee_Id = office_Employee_Id;
		Office_Type = office_Type;
		Office_Name = office_Name;
		Office_Desc = office_Desc;
		Office_Place = office_Place;
		Office_Company_Id = office_Company_Id;
		Office_Id = office_Id;
	}

	public int getOffice_company_id(){
		return Office_Company_Id;
	}

	public int getOffice_Company_Id() {
		return Office_Company_Id;
	}

	public String getOffice_desc(){
		return Office_Desc;
	}

	public String getOffice_Desc() {
		return Office_Desc;
	}

	public int getOffice_employee_id(){
		return Office_Employee_Id;
	}

	public int getOffice_Employee_Id() {
		return Office_Employee_Id;
	}

	public int getOffice_Id() {
		return Office_Id;
	}

	public String getOffice_name(){
		return Office_Name;
	}

	public String getOffice_Name() {
		return Office_Name;
	}

	public String getOffice_place(){
		return Office_Place;
	}

	public String getOffice_Place() {
		return Office_Place;
	}

	public String getOffice_type(){
		return Office_Type;
	}

	public String getOffice_Type() {
		return Office_Type;
	}

	public void setOffice_company_id(int Office_Company_Id){
		this.Office_Company_Id=Office_Company_Id;
	}

	public void setOffice_Company_Id(int office_Company_Id) {
		Office_Company_Id = office_Company_Id;
	}

	public void setOffice_desc(String Office_Desc){
		this.Office_Desc=Office_Desc;
	}

	public void setOffice_Desc(String office_Desc) {
		Office_Desc = office_Desc;
	}

	public void setOffice_employee_id(int Office_Employee_Id){
		this.Office_Employee_Id=Office_Employee_Id;
	}

	public void setOffice_Employee_Id(int office_Employee_Id) {
		Office_Employee_Id = office_Employee_Id;
	}

	public void setOffice_Id(int office_Id) {
		Office_Id = office_Id;
	}

	public void setOffice_name(String Office_Name){
		this.Office_Name=Office_Name;
	}

	public void setOffice_Name(String office_Name) {
		Office_Name = office_Name;
	}

	public void setOffice_place(String Office_Place){
		this.Office_Place=Office_Place;
	}

	public void setOffice_Place(String office_Place) {
		Office_Place = office_Place;
	}

	public void setOffice_type(String Office_Type){
		this.Office_Type=Office_Type;
	}

	public void setOffice_Type(String office_Type) {
		Office_Type = office_Type;
	}
}
