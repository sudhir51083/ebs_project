package com.capgemini.ebs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ebs.entity.RegistrationUser;
import com.capgemini.ebs.service.RegistrationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class RegistrationController {
	@Autowired
	RegistrationService registrationService;

	@PostMapping("/registration")
	public String registerUser(@RequestBody RegistrationUser user) {
		System.out.println("---------------");
		System.out.println(user.toString());
		System.out.println("---------------");
		registrationService.registerUser(user);
		return "User Added";
	}
	@GetMapping("/getRegisteredUsers")
	public List<RegistrationUser> getRegisteredUsers() {
		System.out.println("---------------");
		return registrationService.getRegisteredUsers();
	}
}
