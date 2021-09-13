package com.capgemini.ebs.service;

import java.util.List;

import com.capgemini.ebs.entity.Consumer;
import com.capgemini.ebs.entity.User;

public interface ConnectionService {
	
	void addConnection(Consumer consumer);

	List<Consumer> getUsers();
}
