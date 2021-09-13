package com.capgemini.ebs.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ebs.dto.ForgotUserNamePass;
import com.capgemini.ebs.dto.Response;
import com.capgemini.ebs.service.ForgotUsenamePasswordService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ForgotUserNamePassword {
	@Autowired
	ForgotUsenamePasswordService forgotUsenamePasswordService;

	@PostMapping("/forgot/username-password")
	public Response resetUserNamePassword(@RequestBody ForgotUserNamePass forgotUserNamePass) {
		System.out.println("----forgot/username-password API request----");
		System.out.println(forgotUserNamePass.toString());
		System.out.println("----processing----");
		return forgotUsenamePasswordService.resetUserNamePassword(forgotUserNamePass);
		//userService.addUser(user);
		//return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.OK);
	}
}
