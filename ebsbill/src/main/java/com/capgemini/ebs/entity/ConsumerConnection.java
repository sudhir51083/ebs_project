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
@Entity(name = "consumer_connection")
public class ConsumerConnection {
	@Id
	@Column(name="consumer_number")
	private long consumerNumber;
	@Column(name="billing_unit")
	private String billingUnit;
	@Column(name="meter_number")
	private String meterNumber;
	@Column(name="poll_number")
	private String pollNumber;
	@Column(name="phase_type")
	private String connectionType;
	@Column(name="connection_date")
	private String connectionDate;
	@Column(name="deposit_amount")
	private String depositAmount;
	@Column(name="sanctioned_load")
	private String sanctionedLoad;
	@Column(name="connected_load")
	private String connectedLoad;
	@Column(name="connection_status")
	private String connectionStatus;
	@Column(name="created_on")
	private String createdOn;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="modified_on")
	private String modifiedOn;
	@Column(name="modified_by")
	private String modifiedBy;


	
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	
	public String getBillingUnit() {
		return billingUnit;
	}
	public void setBillingUnit(String billingUnit) {
		this.billingUnit = billingUnit;
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
	public String getConnectionStatus() {
		return connectionStatus;
	}
	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}
	public String getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	@Override
	public String toString() {
		return "ConsumerConnection [consumerNumber=" + consumerNumber + ", billingUnit=" + billingUnit
				+ ", meterNumber=" + meterNumber + ", pollNumber=" + pollNumber + ", connectionType=" + connectionType
				+ ", connectionDate=" + connectionDate + ", depositAmount=" + depositAmount + ", sanctionedLoad="
				+ sanctionedLoad + ", connectedLoad=" + connectedLoad + ", connectionStatus=" + connectionStatus
				+ ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn
				+ ", modifiedBy=" + modifiedBy + "]";
	}
	
	

}
