package com.v2v.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2v.model.ProductModel;



public interface ProductRepository extends JpaRepository<ProductModel,Integer>{

}
