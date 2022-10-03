package com.myproj.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.myproj.util.Utils;

//@EnableWebSecurity
//@Configuration
public class SecurityConfig
//extends WebSecurityConfigurerAdapter 
{

//	@Value("${security.state}")
//	String stateSec;

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// if (stateSec.equals("off")) {
//		if ("off".equalsIgnoreCase(Utils.getProperty("security.state"))) {
//			http.authorizeHttpRequests().antMatchers("*").permitAll();
//		} else {
//			super.configure(http);
//		}
//	}

}
