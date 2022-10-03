package com.myproj.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myproj.util.Utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SecureFilter implements Filter{

	@Autowired
	Utils utils;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//log.debug("message");
		HttpServletResponse httpServletResponse=(HttpServletResponse) response;
		System.out.println(utils.getProperty("security.state"));
		if("off".equalsIgnoreCase(utils.getProperty("security.state"))) {
			System.out.println("jhfkjdsdhfkjsd");
		}else {
			httpServletResponse.sendError(HttpServletResponse.SC_FORBIDDEN);
		}
		chain.doFilter(request, response);
	}
	
	

}
