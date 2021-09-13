package com.capgemini.ebs.filter;

public interface UserDetailService {

	UserDetails loadUserByUsername(String username) throws Exception;
	//UserDetails loadUserByUsername(String username) throws Exception;
}
