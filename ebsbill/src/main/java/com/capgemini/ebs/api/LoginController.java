package com.capgemini.ebs.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ebs.dto.LoginUser;
import com.capgemini.ebs.dto.Response;
import com.capgemini.ebs.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class LoginController {
	
	@Autowired
	UserService userService;

	@PostMapping("/login")
	public Response authenticateUser(@RequestBody LoginUser user) {
		System.out.println("---------------");
		System.out.println(user.toString());
		System.out.println("---------------");
		return userService.isUserExists(user);
		//userService.addUser(user);
		//return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.OK);
	}
}
