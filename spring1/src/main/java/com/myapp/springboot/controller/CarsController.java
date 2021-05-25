package com.myapp.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.springboot.model.Cars;
import com.myapp.springboot.repository.CarsRepository;

@CrossOrigin(origins = { "http://localhost:3000","http://localhost:3001" })
@RestController
@RequestMapping("api/")

public class CarsController {
	
	@Autowired
	private CarsRepository carsRepository;
	
	@GetMapping("cars")
	public List<Cars> getCars(){ 
		
	return this.carsRepository.findAll();
	
	}
}

