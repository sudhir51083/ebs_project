package com.capgemini.ebs.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.capgemini.ebs.dto.User;
import com.capgemini.ebs.entity.User;
import com.capgemini.ebs.service.UserService;


@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		System.out.println("---------------");
		System.out.println(user.toString());
		System.out.println("---------------");
		userService.addUser(user);
		return "User Added";
	}

	@PutMapping("/updateUser/{id}")
	public String updateUser(@RequestBody User user, @PathVariable int id) {
		System.out.println("-------updateUser--------"+id);
		System.out.println(user.toString());
		//user.setId(id);
		userService.updateUser(user);
		System.out.println("---------------");
		return "User Updated";
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		System.out.println("---------------");
		return userService.getUsers();
	}
	
	@GetMapping("/getUserById/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		System.out.println("---------------");
		return userService.getUserById(id);
	}

	@DeleteMapping("/deleteUserByid/{id}")
	public String deleteUserByid(@PathVariable int id) {
		userService.deleteUserByid(id);
		return "User Deleted";
	}

}
