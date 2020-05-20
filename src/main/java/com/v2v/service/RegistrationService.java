package com.v2v.service;

import org.json.JSONObject;

import com.v2v.model.RegistrationModel;

public class RegistrationService {

	
	public JSONObject datarec(RegistrationModel registrationmodel) {
		JSONObject obj = new JSONObject();
		obj.put("UserName",registrationmodel.UserName);
		obj.put("Password",registrationmodel.Password);
		obj.put("Email", registrationmodel.Email);
		obj.put("Role", registrationmodel.Role);
		
		return  obj;
	}
	

}
