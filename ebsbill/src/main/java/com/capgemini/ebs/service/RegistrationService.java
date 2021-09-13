package com.capgemini.ebs.service;

import java.util.List;

import com.capgemini.ebs.entity.RegistrationUser;

public interface RegistrationService {
	void registerUser(RegistrationUser user);

	List<RegistrationUser> getRegisteredUsers();
}
