package com.v2v.controller;


import org.springframework.web.bind.annotation.RestController;

import com.v2v.model.RegistrationModel;
import com.v2v.repository.RegistraionRepository;
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
public class RegistrationController {
	
	
	@Autowired
	RegistraionRepository regisrepos;

	RegistrationService regser = new RegistrationService();
	
	//@CrossOrigin(origins = "http://localhost:4200)
	@CrossOrigin(origins = "http://localhost:8100")
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String register(@RequestBody RegistrationModel registrationmodel) {
		//bussiness service logic implement here
		if(regisrepos.existsById(registrationmodel.UserName))
			System.out.println("Field alredy exists");
			
		else
			regisrepos.save(registrationmodel);
 		return regser.datarec(registrationmodel).toString();
	}
	
}
