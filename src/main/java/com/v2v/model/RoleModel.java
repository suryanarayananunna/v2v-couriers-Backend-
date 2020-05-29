package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleModel {
	
	@Id
	@Column(name="Role_Id")
	private int Role_Id;

	@Column(name="Role_Title")
	private String Role_Title;
	
	@Column(name="Role_Desc")
	private String Role_Desc;
	


	public RoleModel(String role_Title, String role_Desc, int role_Id) {
		super();
		Role_Title = role_Title;
		Role_Desc = role_Desc;
		Role_Id = role_Id;
	}
	

	public RoleModel() {
		super();
	}


	public int getRole_Id() {
		return Role_Id;
	}

	public void setRole_Id(int role_Id) {
		Role_Id = role_Id;
	}

	public String getRole_title(){
		return Role_Title;
	}

	public void setRole_title(String Role_Title){
		this.Role_Title=Role_Title;
	}

	public String getRole_desc(){
		return Role_Desc;
	}

	public void setRole_desc(String Role_Desc){
		this.Role_Desc=Role_Desc;
	}
	
}
