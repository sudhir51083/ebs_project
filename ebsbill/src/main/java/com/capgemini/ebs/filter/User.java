package com.capgemini.ebs.filter;

import java.util.List;

public class User {
	private String username;
	private String password;
	List<User> listUsers;

	public User(String username, String password, List<User> listUsers) {
		super();
		this.username = username;
		this.password = password;
		this.listUsers = listUsers;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}
}
