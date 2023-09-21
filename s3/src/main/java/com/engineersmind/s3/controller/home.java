package com.engineersmind.s3.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class home {
	
	
	@GetMapping
	public String hometext() 
	{
		return "checking CI-CD running ........";
	}

}
