package com.capgemini.ebs.serviceImpl;

import org.springframework.stereotype.Service;

import com.capgemini.ebs.dto.CalculatorRequest;
import com.capgemini.ebs.dto.CalculatorResponse;
import com.capgemini.ebs.dto.Response;
import com.capgemini.ebs.service.BillCalculatorService;
import com.capgemini.ebs.utils.Calclulator;

@Service
public class BillCalculatorServiceImpl implements BillCalculatorService{

	public Response calculateBill(CalculatorRequest calculatorRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CalculatorResponse calculateEBill(CalculatorRequest calculatorRequest) {
		//CalculatorResponse calculatorResponse = new CalculatorResponse();
		/*calculatorResponse.setFixedCharges("7.00");
		calculatorResponse.setEnergyCharges("10.00");
		calculatorResponse.setElectricityDuty("15.80");
		calculatorResponse.setWheelingCharges("80.00");
		calculatorResponse.setFuelAdjustmentCharges("0.00");
		calculatorResponse.setTaxOnSaleCharges("0.00");
		calculatorResponse.setTotal("107.00");*/
		return Calclulator.calculateBill(calculatorRequest);
	}

}
