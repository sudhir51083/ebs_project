package com.capgemini.ebs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.capgemini.ebs.dto.LoginUser;
import com.capgemini.ebs.dto.Response;
//import com.capgemini.ebs.dto.User;
import com.capgemini.ebs.entity.User;

public interface UserService {

	void addUser(User user);

	List<User> getUsers();

	void deleteUserByid(int id);

	void updateUser(User user);

	Optional<User> getUserById(int id);

	ResponseEntity<Response> isUserExist(LoginUser user);

	Response isUserExists(LoginUser user);

}
