package com.engineersmind.s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.engineersmind.s3.model")
public class S3Application {

	public static void main(String[] args) {
		SpringApplication.run(S3Application.class, args);     
	}

}
