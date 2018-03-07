package com.example.demoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class DemoapiApplication {

	@Bean
	public Random random(){
		return new Random();
	}

	@Autowired
	private Random random;

	@CrossOrigin
	@RequestMapping("/review")
	public ReviewModel home(){
		return new ReviewModel(
				random.nextFloat()*10,
				random.nextFloat()*10,
				random.nextFloat()*10,
				random.nextFloat()*10,
				random.nextFloat()*10,
				random.nextFloat()*10);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoapiApplication.class, args);
	}
}
