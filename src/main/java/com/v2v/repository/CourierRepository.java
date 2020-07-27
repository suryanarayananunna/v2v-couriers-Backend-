package com.v2v.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2v.model.CourierModelNew;


public interface CourierRepository extends JpaRepository<CourierModelNew,Integer> {

}
