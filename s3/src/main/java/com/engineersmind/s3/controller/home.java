package com.engineersmind.s3.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class home {
	
	
	@GetMapping("/test")
	public String hometext1() 
	{
		return "Apllication Test on 9/25 ....";
	}
	@GetMapping
	public String hometext() 
	{
		return "checking CI-CD running ....";
	}
}
