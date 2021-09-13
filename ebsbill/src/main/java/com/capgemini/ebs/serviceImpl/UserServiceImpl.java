package com.capgemini.ebs.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.ebs.dto.LoginUser;
import com.capgemini.ebs.dto.Response;
//import com.capgemini.ebs.dto.User;
import com.capgemini.ebs.entity.User;
import com.capgemini.ebs.repository.UserRepository;
import com.capgemini.ebs.service.UserService;
import com.capgemini.ebs.utils.PasswordUtils;
import com.capgemini.ebs.validation.ErrorCode;

@Service
public class UserServiceImpl implements UserService {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {
		userRepository.saveAndFlush(user);
	}

	public List<User> getUsers() {
		System.out.println("Find all is working...");
		return userRepository.findAll();
	}

	@Override
	public void deleteUserByid(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public void updateUser(User user) {
		log.info("updateUser Started");
		boolean exist = userRepository.existsById(user.getId());
		if (exist) {
			log.info("User Exist.");
			/*
			 * User usr = userRepository.findById(user.getId()).get();
			 * usr.setId(user.getId()); usr.setFirstName(user.getFirstName());
			 * usr.setLastName(user.getLastName()); usr.setEmail(user.getEmail());
			 */
			userRepository.saveAndFlush(user);
		} else {
			throw new RuntimeException("There is not employee with id " + user.getId());
		}
		log.info("updateUser Ended");
	}

	@Override
	public Optional<User> getUserById(int id) {
		log.info("Find one is working...");
		return userRepository.findById(id);
	}

	public ResponseEntity<Response> isUserExist(LoginUser user) {
		boolean exist = userRepository.existsByEmail(user.getEmail());
		String password = PasswordUtils.getDecryptedPassword(user.getPassword());
		System.out.println("PASSWORD IS : "+password);
		Response response = new Response();
		if(exist && "password".equals(password)) {
			log.info("@@@USERID PASSWORD MATCH...!");
			response.setStatus(true);
			response.setMessage("Success");
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		log.info("?????NOT MATCHED-USERID PASSWORD...!");
		response.setStatus(false);
		response.setMessage(ErrorCode.INVALID_USERNAME_PASSWORD.getErrorText());
		return ResponseEntity.status(HttpStatus.FOUND).build();
	}
	
	public Response isUserExists(LoginUser user) {
		boolean exist = userRepository.existsByEmail(user.getEmail());
		Response response = new Response();
		response.setStatus(false);
		response.setMessage(ErrorCode.INVALID_USERNAME_PASSWORD.getErrorText());
		String password = PasswordUtils.getDecryptedPassword(user.getPassword());
		//System.out.println("PASSWORD IS : "+password);
		//String password = user.getPassword();
		if(exist && "password".equals(password)) {
			log.info("@@@USERID PASSWORD MATCH...!");
			response.setStatus(true);
			response.setMessage("Success");
			return response;
		}
		log.info("?????NOT MATCHED-USERID PASSWORD...!");
		return response;
	}

}
