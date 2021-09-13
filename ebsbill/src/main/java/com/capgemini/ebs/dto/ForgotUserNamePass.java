package com.capgemini.ebs.dto;

public class ForgotUserNamePass {
	private String type;
	private String loginName;
	private String registeredEmail;
	private String registeredMobile;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getRegisteredEmail() {
		return registeredEmail;
	}
	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}
	public String getRegisteredMobile() {
		return registeredMobile;
	}
	public void setRegisteredMobile(String registeredMobile) {
		this.registeredMobile = registeredMobile;
	}
	@Override
	public String toString() {
		return "ForgotUserNamePass [type=" + type + ", loginName=" + loginName + ", registeredEmail=" + registeredEmail
				+ ", registeredMobile=" + registeredMobile + "]";
	}
	
}
