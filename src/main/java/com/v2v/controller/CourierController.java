package com.v2v.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.v2v.model.CourierModelNew;
import com.v2v.model.ResultModel;
import com.v2v.repository.CourierRepository;
import com.v2v.service.CourierService;
import com.v2v.service.ResultModelService;

@RestController
public class CourierController {
	
	@Autowired
	CourierRepository courierrepos;

	CourierService courierservice = new CourierService();
	ResultModelService rms = new ResultModelService();
	
	
	@CrossOrigin(origins = "http://localhost:8100")
	@RequestMapping(value="/getCourierDetails",method = RequestMethod.POST)
	@PutMapping(produces = {"application/json"})
    @ResponseBody
	public Optional<CourierModelNew> getCourierDetails(@RequestBody CourierModelNew couriermodelNew) {
		if(courierrepos.existsById(couriermodelNew.Courier_id)) {
			//return rms.returnResult(courierrepos.findById(couriermodelNew.Courier_id).get(), "success");
			return courierrepos.findById(couriermodelNew.Courier_id);
		}
		else {
			return null;
		}
	}
	
}
