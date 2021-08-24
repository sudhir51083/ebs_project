package com.capgemini.ebs.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EBSHello {
	
	@GetMapping("/ebs/welcome")
	public String welcome() {
		return "Welcome to EBS Billing System.";
	}
}
