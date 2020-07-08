package com.v2v.controller;
import org.springframework.web.bind.annotation.RestController;

import com.v2v.model.LoginModel;
import com.v2v.model.RegistrationModel;
import com.v2v.repository.LoginRepository;
import com.v2v.repository.RegistraionRepository;
import com.v2v.service.LoginService;
import com.v2v.service.RegistrationService;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoginController {


	
	@Autowired
	LoginRepository loginrepos;

	LoginService loginser = new LoginService();
	
	//@CrossOrigin(origins = "http://localhost:4200)
	@CrossOrigin(origins = "http://localhost:8100")
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(@RequestBody LoginModel loginmodel) {
		//bussiness service logic implement here
		if(loginrepos.existsById(loginmodel.Login_User_Name  )) {
			System.out.println("Login details are in db check now to verify password");
			System.out.println(loginrepos.findById(loginmodel.Login_User_Name).get().Login_User_Password);
			if(loginrepos.findById(loginmodel.Login_User_Name).get().Login_User_Password.contentEquals(loginmodel.Login_User_Password)) {
				System.out.println("success");
				return "success";
		}
			else {
				System.out.println("failed");
				return "failed";
			}
		}
		
			
		else
		{
		System.out.println("nodatafound");
 		return "nodatafound";
		}
	}
	
}
