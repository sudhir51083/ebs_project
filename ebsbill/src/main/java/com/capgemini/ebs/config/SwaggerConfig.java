
package com.capgemini.ebs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.capgemini.ebs.api")).build();
	}

	/*
	 * private static final String[] AUTH_WHITELIST = { //
	 * "** /swagger-resources/**", "/swagger-ui.html", "/v2/api-docs", "/webjars/**"
	 * };
	 * 
	 * @Override public void configure(HttpSecurity web) throws Exception {
	 * web.ignoring().antMatchers(AUTH_WHITELIST); }
	 */

}
