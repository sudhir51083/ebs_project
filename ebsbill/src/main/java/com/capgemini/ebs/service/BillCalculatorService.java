package com.capgemini.ebs.service;

import com.capgemini.ebs.dto.CalculatorRequest;
import com.capgemini.ebs.dto.CalculatorResponse;
import com.capgemini.ebs.dto.LoginUser;
import com.capgemini.ebs.dto.Response;

public interface BillCalculatorService {

	Response calculateBill(CalculatorRequest calculatorRequest);
	CalculatorResponse calculateEBill(CalculatorRequest calculatorRequest);

}
