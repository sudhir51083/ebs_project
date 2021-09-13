package com.capgemini.ebs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "consumer")
public class Consumer {
	@Id
	@Column(name="consumer_number")
	private long consumerNumber;
	@Column(name="consumer_name")
	private String consumerName;
	@Column(name="email_id")
	private String emailId; 
	@Column(name="mobile_number")
	private String mobileNumber;
	//private String billingUnit;
	@Column(name="address")
	private String address;
	@Column(name="status")
	private String status;
	
	@Column(name="created_on")
	private String createdOn;
	@Column(name="created_by")
	private String createdBy;

	/*
	 * private String connectionType; private String connectionDate; private String
	 * depositAmount; private String sanctionedLoad; private String connectedLoad;
	 */
	private String billingUnit;
	private String meterNumber;
	private String pollNumber;
	private String connectionType;
	private String connectionDate;
	private String depositAmount;
	private String sanctionedLoad;
	private String connectedLoad;
	
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getBillingUnit() {
		return billingUnit;
	}
	public void setBillingUnit(String billingUnit) {
		this.billingUnit = billingUnit;
	}
	public String getMeterNumber() {
		return meterNumber;
	}
	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}
	public String getPollNumber() {
		return pollNumber;
	}
	public void setPollNumber(String pollNumber) {
		this.pollNumber = pollNumber;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public String getConnectionDate() {
		return connectionDate;
	}
	public void setConnectionDate(String connectionDate) {
		this.connectionDate = connectionDate;
	}
	public String getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getSanctionedLoad() {
		return sanctionedLoad;
	}
	public void setSanctionedLoad(String sanctionedLoad) {
		this.sanctionedLoad = sanctionedLoad;
	}
	public String getConnectedLoad() {
		return connectedLoad;
	}
	public void setConnectedLoad(String connectedLoad) {
		this.connectedLoad = connectedLoad;
	}
	
}
