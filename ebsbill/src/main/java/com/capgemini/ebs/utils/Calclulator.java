package com.capgemini.ebs.utils;

import com.capgemini.ebs.dto.CalculatorRequest;
import com.capgemini.ebs.dto.CalculatorResponse;

public class Calclulator {
	private static final double fuelAdjCharges = 0.00;
	private static final double taxOnSaleCharges = 0.00;
	private static final double fixedCharges = 102.00;
	public static CalculatorResponse calculateBill(CalculatorRequest calculatorRequest){
		CalculatorResponse calculatorResponse = new CalculatorResponse();
		calculatorResponse.setEnergyCharges(getEnergyCharges(calculatorRequest.getUnitConsumption()));
		calculatorResponse.setFixedCharges(fixedCharges);
		calculatorResponse.setElectricityDuty(getElectricityDutyCharges(calculatorRequest.getUnitConsumption()));
		calculatorResponse.setWheelingCharges(getWheelingCharges(calculatorRequest.getUnitConsumption()));
		calculatorResponse.setFuelAdjustmentCharges(fuelAdjCharges);
		calculatorResponse.setTaxOnSaleCharges(taxOnSaleCharges);
		calculatorResponse.setTotal(getTotalCharges(calculatorRequest.getUnitConsumption()));
		return calculatorResponse;
	}
	private static double getTotalCharges(int units) {
		double total = fixedCharges+getEnergyCharges(units)+getElectricityDutyCharges(units)+
				getWheelingCharges(units)+fuelAdjCharges+taxOnSaleCharges;
		total = Math.round(total*100.0)/100.0;
		return total;
	}
	private static double getBillTarrif(int units) {
		double charges = 0.00;
		if(units>=100) {
			charges = 3.44;
			//return charges;
		}
		else if(units>100 && units<=300) {
			charges = 7.34;
			//return charges;
		}
		else if(units>300 && units<=500) {
			charges = 10.36;
			//return charges;
		}
		else if(units>500 && units<1000) {
			charges = 11.82;
			//return charges;
		}
		else if(units>1000) {
			charges = 11.82;
			//return charges;
		}
		return charges;
	}
	private static double getEnergyCharges(int units) {
		double eCharges = units*getBillTarrif(units);
		eCharges = Math.round(eCharges*100.0)/100.0;
		return eCharges;
	}
	private static double getElectricityDutyCharges(int units) {
		//16%
		double eCharges = 0.16*getEnergyCharges(units);
		eCharges = Math.round(eCharges*100.0)/100.0;
		return eCharges;
	}
	private static double getWheelingCharges(int units) {
		//@1.45 rs/u
		double eCharges = units*1.45;
		eCharges = Math.round(eCharges*100.0)/100.0;
		return eCharges;
	}
}
