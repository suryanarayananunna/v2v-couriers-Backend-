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
import com.v2v.model.CustomerModel;
import com.v2v.model.DeliveryModel;
import com.v2v.repository.CourierRepository;
import com.v2v.repository.CustomerRepository;
import com.v2v.repository.DeliveryRepository;
import com.v2v.service.CourierService;
import com.v2v.service.CustomerService;
import com.v2v.service.DeliveryService;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerrepos;

	CustomerService customerservice = new CustomerService();
	
	
	@CrossOrigin(origins = "http://localhost:8100")
	@RequestMapping(value="/getCustomerDetails",method = RequestMethod.POST)
	@PutMapping(produces = {"application/json"})
    @ResponseBody
	public Optional<CustomerModel> getCustomerDetails(@RequestBody CustomerModel cusmodel) {
		if(customerrepos.existsById(cusmodel.getCustomer_Id())) {
			return customerrepos.findById(cusmodel.Customer_Id);
		}
		else {
			return null;
		}
	}
	
}
