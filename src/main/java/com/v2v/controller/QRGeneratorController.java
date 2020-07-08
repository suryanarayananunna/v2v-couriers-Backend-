package com.v2v.controller;

import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.v2v.model.CourierModel;
import com.v2v.repository.CourierSerivceProviderRepository;
import com.v2v.service.QRGenerateService;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class QRGeneratorController {
				
		@Autowired
		CourierSerivceProviderRepository courierservicerepos;

		QRGenerateService qrgenerateservice = new QRGenerateService();
		
		
		//@CrossOrigin(origins = "http://localhost:4200")
		@CrossOrigin(origins = "http://localhost:8100")
		@RequestMapping(value="/qrgenerate",method = RequestMethod.POST)
		public void qrgenerator(@RequestBody CourierModel CourierModel) {
			//bussiness service logic implement here
			 
			try {
				CourierModel.setCourierId(CourierModel.CourierProductId);
				courierservicerepos.save(CourierModel);
				qrgenerateservice.generateQrCode(CourierModel);
			} catch (NotFoundException | WriterException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		
		}
		
	}

