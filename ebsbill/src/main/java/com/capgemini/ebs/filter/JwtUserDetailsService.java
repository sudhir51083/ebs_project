package com.capgemini.ebs.filter;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailService {
	
	@Override
	public UserDetails loadUserByUsername(String username) throws Exception {
		if ("javainuse".equals(username)) {
			return new UserDetails("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			throw new Exception("User not found with username: " + username);
		}
	}
}
