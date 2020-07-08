package com.v2v.service;
import org.json.JSONObject;

import com.v2v.model.LoginModel;

public class LoginService {


	public JSONObject datarec(LoginModel loginmodel) {
		JSONObject obj = new JSONObject();
		obj.put("UserName",loginmodel.Login_User_Name);
		obj.put("Password",loginmodel.Login_User_Password);
		obj.put("Role", loginmodel.Login_Role_Id);
		
		return  obj;
	}
	
}


