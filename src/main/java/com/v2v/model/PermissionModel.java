package com.v2v.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permission")
public class PermissionModel {
	
	@Id
	@Column(name="Permission_id")
	private int Permission_id;
	
	@Column(name="Permission_Role_Id")
	private int Permission_Role_Id;
	
	@Column(name="Permission_Title")
	private String Permission_Title;
	
	@Column(name="Permission_Module")
	private String Permission_Module;
	
	@Column(name="Permission_Desc")
	private String Permission_Desc;

	

	public PermissionModel() {
		super();
	}

	public PermissionModel(int permission_Role_Id, String permission_Title, String permission_Module,
			String permission_Desc, int permission_id) {
		super();
		Permission_Role_Id = permission_Role_Id;
		Permission_Title = permission_Title;
		Permission_Module = permission_Module;
		Permission_Desc = permission_Desc;
		Permission_id = permission_id;
	}

	public int getPermission_Role_Id() {
		return Permission_Role_Id;
	}

	public void setPermission_Role_Id(int permission_Role_Id) {
		Permission_Role_Id = permission_Role_Id;
	}

	public String getPermission_Title() {
		return Permission_Title;
	}

	public void setPermission_Title(String permission_Title) {
		Permission_Title = permission_Title;
	}

	public String getPermission_Module() {
		return Permission_Module;
	}

	public void setPermission_Module(String permission_Module) {
		Permission_Module = permission_Module;
	}

	public String getPermission_Desc() {
		return Permission_Desc;
	}

	public void setPermission_Desc(String permission_Desc) {
		Permission_Desc = permission_Desc;
	}

	public int getPermission_id() {
		return Permission_id;
	}

	public void setPermission_id(int permission_id) {
		Permission_id = permission_id;
	}

	public int getPermission_role_id(){
		return Permission_Role_Id;
	}

	public void setPermission_role_id(int Permission_Role_Id){
		this.Permission_Role_Id=Permission_Role_Id;
	}

	public String getPermission_title(){
		return Permission_Title;
	}

	public void setPermission_title(String Permission_Title){
		this.Permission_Title=Permission_Title;
	}

	public String getPermission_module(){
		return Permission_Module;
	}

	public void setPermission_module(String Permission_Module){
		this.Permission_Module=Permission_Module;
	}

	public String getPermission_desc(){
		return Permission_Desc;
	}

	public void setPermission_desc(String Permission_Desc){
		this.Permission_Desc=Permission_Desc;
	}
}
