package com.v2v.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.v2v.model.RegistrationModel;

@Repository
public interface RegistraionRepository extends JpaRepository<RegistrationModel,String>{

	
	
}
