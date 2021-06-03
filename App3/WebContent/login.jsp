<%@page import="com.test.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="btc/login" >
		<h1>login page</h1>
		Enter Email : <input type = "text" name = "email"><br><br>
		Enter Password : <input type = "password" name = "pwd"><br><br>
			
			<input type = "submit" value = "login">
	</form>	
	<a href = "register.html">register here</a>	
	
	<%
		Employee e = new Employee();
		
	    e.setEmail("btc");
	    e.setPass("admin");
	%>
	
</body>
</html>