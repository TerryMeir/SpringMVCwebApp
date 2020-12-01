package com.springMVC.jee;

import org.springframework.stereotype.Service;
//Annotated to be a service in this spring project - instead of creating a new instance of this class i'll annotate the object to @Autowired 
@Service 		
public class UserValidationService {
	
	public boolean isUserValid(String user, String Password){
		if(user.equals("Terry"))
			return true;
		else return false;
	}

}
