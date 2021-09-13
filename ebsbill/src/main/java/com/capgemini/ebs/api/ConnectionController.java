package com.capgemini.ebs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ebs.entity.Consumer;
import com.capgemini.ebs.entity.User;
import com.capgemini.ebs.service.ConnectionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ConnectionController {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DownloadBill.class);
	
	@Autowired
	ConnectionService connectionService;
	

	@GetMapping("/connections")
	public List<User> getUConnections() {
		System.out.println("---------------");
		//return userService.getUsers();
		return null;
	}
	
	@PostMapping("/new-connection")
	public String addConnection(@RequestBody Consumer consumer) {
		log.info("---------------");
		System.out.println(consumer.toString());
		System.out.println("---------------");
		connectionService.addConnection(consumer);
		return "Connection Added";
	}
}
