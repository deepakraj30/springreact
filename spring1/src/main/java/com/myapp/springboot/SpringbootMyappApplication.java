package com.myapp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myapp.springboot.model.Cars;
import com.myapp.springboot.repository.CarsRepository;

@SpringBootApplication
public class SpringbootMyappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMyappApplication.class, args);
	}

	@Autowired
	private CarsRepository carsRepository;
	@Override
	public void run(String... args) throws Exception {
	 this.carsRepository.save(new Cars("Hyundai","Creta","Petrol","Manual") );
	 this.carsRepository.save(new Cars("TATA","Safari","Diesel","Manual") );
	 this.carsRepository.save(new Cars("Volkswagen","Polo","Petrol","Automatic"));
	 this.carsRepository.save(new Cars("Toyota","Innova","Diesel"," Automatic") );
	 this.carsRepository.save(new Cars("Ford","Freestyle","Petrol","CVT") );
	 this.carsRepository.save(new Cars("Maruti","Swift","Petrol","CVT") );
	 
	 
	}

}
