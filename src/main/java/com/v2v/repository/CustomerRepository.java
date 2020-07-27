package com.v2v.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2v.model.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel,Integer>{

}
