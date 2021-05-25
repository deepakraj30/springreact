package com.myapp.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.springboot.model.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long>{

	List<Cars> findAll();

}
