package com.capgemini.ebs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class EbsbillApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbsbillApplication.class, args);
	}

	/*
	 * @Configuration
	 * 
	 * @Order(SecurityProperties.BASIC_AUTH_ORDER) protected static class
	 * SecurityConfiguration extends WebSecurityConfigurerAdapter {
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.httpBasic().and().authorizeRequests() .antMatchers("*", "/", "/home",
	 * "/login","list-bill").permitAll() .anyRequest().authenticated(); } }
	 */
}
