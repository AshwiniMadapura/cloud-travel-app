package com.nology.cloudtravelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
public class CloudTravelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTravelAppApplication.class, args);
	}

}
