package com.springMVC.jee;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidationService validationService = new UserValidationService();	//construct user validation object

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response); // direct the response to JSP file instead of PrintWriter object to write HTML code

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userName = request.getParameter("userName");	//extract user name from request 
		request.setAttribute("userName", userName); // set attribute to display on welcome jsp 
		String userPassword = request.getParameter("userPassword");	//extract user password from request
		request.setAttribute("userPassword", userPassword);
		boolean isUserValid = validationService.isUserValid(userName, userPassword);	//passing user name and password to validation object to valid information
		if(isUserValid){
			request.getRequestDispatcher("/WEB-INF/views/welcomePage.jsp").forward(request, response);
		}else{
			request.setAttribute("errorMessage", "Invalid User Name!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		

	}

}