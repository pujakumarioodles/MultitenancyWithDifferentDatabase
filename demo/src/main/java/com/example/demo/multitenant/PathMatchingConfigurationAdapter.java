package com.example.demo.multitenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PathMatchingConfigurationAdapter implements WebMvcConfigurer {

	



	 @Autowired
	    private MyRequestInterceptor myRequestInterceptor;
	//add your interceptor
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(myRequestInterceptor);}

	
}
