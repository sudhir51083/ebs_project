package com.capgemini.ebs.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ebs.dto.CalculatorRequest;
import com.capgemini.ebs.dto.CalculatorResponse;
import com.capgemini.ebs.dto.LoginUser;
import com.capgemini.ebs.dto.Response;
import com.capgemini.ebs.service.BillCalculatorService;
import com.capgemini.ebs.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CalculatorController {
	@Autowired
	BillCalculatorService billCalculatorService;

	@PostMapping("/calculate/bill")
	public CalculatorResponse calculateBill(@RequestBody CalculatorRequest calculatorRequest) {
		System.out.println("---------------");
		System.out.println(calculatorRequest.toString());
		System.out.println("---------------");
		return billCalculatorService.calculateEBill(calculatorRequest);
		//userService.addUser(user);
		//return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.OK);
	}
}
