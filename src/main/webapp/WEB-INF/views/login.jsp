
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1255">
		<title>HI FROM TERRY - JSP</title>
	</head>
	<body>
	<%
		Date todayDate = new Date();
	%>
		<div>Current date is: <%=todayDate %></div>
		My first JSP
	</body>
</html>