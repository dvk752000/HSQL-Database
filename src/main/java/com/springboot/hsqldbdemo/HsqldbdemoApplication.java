package com.springboot.hsqldbdemo;

import com.springboot.hsqldbdemo.location.Location;
import com.springboot.hsqldbdemo.location.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HsqldbdemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HsqldbdemoApplication.class, args);
	}

	@Autowired
	LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(locationRepository.save(new Location("My Location")));
	}

}
