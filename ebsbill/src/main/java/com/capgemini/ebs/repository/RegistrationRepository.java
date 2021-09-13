package com.capgemini.ebs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.ebs.entity.RegistrationUser;

public interface RegistrationRepository extends JpaRepository<RegistrationUser, String>{

	boolean existsByEmailId(String registeredEmail);

	boolean existsByMobileNumber(String registeredMobile);

	boolean existsByUserId(String registeredMobile);
	
}
