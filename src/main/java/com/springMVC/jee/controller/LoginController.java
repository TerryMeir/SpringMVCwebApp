package com.springMVC.jee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springMVC.jee.UserValidationService;

@Controller		//declares that this is a spring controller
public class LoginController {
	
	private UserValidationService validationService = new UserValidationService();
	
	@RequestMapping(value="/login", method=RequestMethod.GET)		//mapping it to http://localhost:8080/spring-mvc/login 
	public String showLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)		//mapping it to http://localhost:8080/spring-mvc/welcomePage 
	public String showWelcomePage(@RequestParam String userName,
			@RequestParam String userPassword, ModelMap model){
		
		boolean isUserValid = validationService.isUserValid(userName, userPassword);	//passing user name and password to validation object to valid information
		if (!isUserValid)
		{
			model.put("errorMessage", "Invalid User Name!");
			return "login";
		}
		model.put("userName", userName);
		model.put("userPassword", userPassword);
		return "welcomePage";
	}

}
