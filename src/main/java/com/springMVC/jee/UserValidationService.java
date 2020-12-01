package com.springMVC.jee;

public class UserValidationService {
	
	public boolean isUserValid(String user, String Password){
		if(user.equals("Terry"))
			return true;
		else return false;
	}

}
