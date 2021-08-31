package com.healthcare.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.healthcare.app")
public class HealthcareAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareAppApplication.class, args);
	}

}
