package com.springMVC.jee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller		//declares that this is a spring controller
public class LoginController {
	
	@RequestMapping(value="/login")		//mapping it to http://localhost:8080/spring-mvc/login 
	public String helloController(){
		return "login";
	}

}
