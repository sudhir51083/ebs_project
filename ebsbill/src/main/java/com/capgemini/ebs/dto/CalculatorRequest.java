package com.capgemini.ebs.dto;

public class CalculatorRequest {
	private String sanctionLoad;
	private String connectedLoad; 
	private String phaseType;
	private int unitConsumption;
	public String getSanctionLoad() {
		return sanctionLoad;
	}
	public void setSanctionLoad(String sanctionLoad) {
		this.sanctionLoad = sanctionLoad;
	}
	public String getConnectedLoad() {
		return connectedLoad;
	}
	public void setConnectedLoad(String connectedLoad) {
		this.connectedLoad = connectedLoad;
	}
	public String getPhaseType() {
		return phaseType;
	}
	public void setPhaseType(String phaseType) {
		this.phaseType = phaseType;
	}
	public int getUnitConsumption() {
		return unitConsumption;
	}
	public void setUnitConsumption(int unitConsumption) {
		this.unitConsumption = unitConsumption;
	}
	@Override
	public String toString() {
		return "CalculatorRequest [sanctionLoad=" + sanctionLoad + ", connectedLoad=" + connectedLoad + ", phaseType="
				+ phaseType + ", unitConsumption=" + unitConsumption + "]";
	}
	
}
