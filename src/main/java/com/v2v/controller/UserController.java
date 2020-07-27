package com.v2v.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.v2v.model.UserModel;
import com.v2v.repository.UserRepository;
import com.v2v.service.UserService;


@RestController
public class UserController {

	
	@Autowired
	UserRepository userrepos;

	UserService loginser = new UserService();
	
	
	@CrossOrigin(origins = "http://localhost:8100")
	@RequestMapping(value="/getUserDetails",method = RequestMethod.POST)
	@PutMapping(produces = {"application/json"})
    @ResponseBody
	public UserModel getUserDetails(@RequestBody UserModel usermodel) {
		if(userrepos.existsById(usermodel.User_Id)) {
			return userrepos.getOne(usermodel.User_Id);
		}
		else {
			return userrepos.getOne(usermodel.User_Id);
		}
		
	}

}
