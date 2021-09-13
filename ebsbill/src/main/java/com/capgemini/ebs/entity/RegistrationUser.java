package com.capgemini.ebs.entity;

import java.util.Date;

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
@Entity(name="user_info")
public class RegistrationUser {
	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name="consumer_number")
	private String consumerNumber;
	@Column(name="email_id")
	private String emailId;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="user_password")
	private String userPassword;
	@Column(name="created_on")
	private Date createdOn;
	@Column(name="modified_on")
	private Date modifiedOn;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	@Override
	public String toString() {
		return "RegistrationUser [userId=" + userId + ", consumerNumber=" + consumerNumber + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", userPassword=" + userPassword + ", createdOn=" + createdOn
				+ ", modifiedOn=" + modifiedOn + "]";
	}
	
	
}
