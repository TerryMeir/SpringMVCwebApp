<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=windows-1255" 
	pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1255">
		<title>HI FROM TERRY - JSP</title>
	</head>
	<body>
		<%Date todayDate = new Date();%>
		<div>Current date is: <%=todayDate %> </div>
		<h1>To Do List</h1>
		<form action="/login.do" method="post">
			Please enter your name <input type="text" name="userName">
			Password <input type="password" name="userPassword"> <input type="submit"> 
		</form>
		<p style="color:red;">${errorMessage}</p>
	</body>
</html>