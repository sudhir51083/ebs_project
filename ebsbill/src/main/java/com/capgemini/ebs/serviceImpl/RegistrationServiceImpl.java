package com.capgemini.ebs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ebs.entity.RegistrationUser;
import com.capgemini.ebs.repository.RegistrationRepository;
import com.capgemini.ebs.service.RegistrationService;
import com.capgemini.ebs.utils.EBSUtility;
import com.capgemini.ebs.utils.PasswordUtils;

@Service
public class RegistrationServiceImpl implements RegistrationService{
private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(RegistrationService.class);
	
	@Autowired
	private RegistrationRepository registrationRepository;

	@Override
	public void registerUser(RegistrationUser user) {
		log.info("Registering user..."+user.getUserId());
		//RegistrationUser rUser = new RegistrationUser();
		//rUser.setUserId(user.getUserId());
		//user.setUserPassword(PasswordUtils.getDecryptedPassword(user.getUserPassword()));
		user.setCreatedOn(EBSUtility.getTodaysDate());
		user.setModifiedOn(EBSUtility.getTodaysDate());
		log.info("Registering user..."+EBSUtility.getTodaysDate()+ " "+EBSUtility.getConsumerNumber());
		registrationRepository.save(user);
	}

	@Override
	public List<RegistrationUser> getRegisteredUsers() {
		log.info("getRegisteredUsers list...");
		return registrationRepository.findAll();
	}
	
	
}
