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

import com.v2v.model.ProductModel;
import com.v2v.model.UserModel;
import com.v2v.repository.ProductRepository;
import com.v2v.repository.UserRepository;
import com.v2v.service.ProductService;
import com.v2v.service.UserService;

@RestController
public class ProductController {


	
	@Autowired
	ProductRepository prorepo;

	ProductService proservice = new ProductService();
	
	@CrossOrigin(origins = "http://localhost:8100")
	@RequestMapping(value="/getProductDetails",method = RequestMethod.POST)
	@PutMapping(produces = {"application/json"})
    @ResponseBody
	public Optional<ProductModel> getProductDetails(@RequestBody ProductModel productmodel) {
		if(prorepo.existsById(productmodel.Product_Id)) {
			System.out.println(prorepo.findById(productmodel.Product_Id));
			return prorepo.findById(productmodel.Product_Id);
		}
		else {
			Optional<ProductModel> pro = null;
			return pro;
		}
	}
	
	
	@CrossOrigin(origins = "http://localhost:8100")
	@RequestMapping(value="/setProductDetails",method = RequestMethod.POST)
	public String setProductDetails(@RequestBody ProductModel productmodel) {
		if(prorepo.existsById(productmodel.Product_Id)) {
			return "Product with the Product id already exists";
		}
		else {
			prorepo.save(productmodel);
			return "Product details Updated";
		}
	}
	
	
	
	
	
	
	
}
