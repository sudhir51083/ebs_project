package com.capgemini.ebs.dto;

public class CalculatorResponse {
	private double fixedCharges;
	private double energyCharges;
	private double electricityDuty;
	private double wheelingCharges;
	private double fuelAdjustmentCharges;
	private double taxOnSaleCharges;
	private double total;
	public double getFixedCharges() {
		return fixedCharges;
	}
	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}
	public double getEnergyCharges() {
		return energyCharges;
	}
	public void setEnergyCharges(double energyCharges) {
		this.energyCharges = energyCharges;
	}
	public double getElectricityDuty() {
		return electricityDuty;
	}
	public void setElectricityDuty(double electricityDuty) {
		this.electricityDuty = electricityDuty;
	}
	public double getWheelingCharges() {
		return wheelingCharges;
	}
	public void setWheelingCharges(double wheelingCharges) {
		this.wheelingCharges = wheelingCharges;
	}
	public double getFuelAdjustmentCharges() {
		return fuelAdjustmentCharges;
	}
	public void setFuelAdjustmentCharges(double fuelAdjustmentCharges) {
		this.fuelAdjustmentCharges = fuelAdjustmentCharges;
	}
	public double getTaxOnSaleCharges() {
		return taxOnSaleCharges;
	}
	public void setTaxOnSaleCharges(double taxOnSaleCharges) {
		this.taxOnSaleCharges = taxOnSaleCharges;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
