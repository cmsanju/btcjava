<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>this is login page</h1>
		
		<form:form action="details" modelAttribute="user">
		
		Enter Id : <form:input path="id"/><br><br>
		Enter Name : <form:input path="name"/><br><br>
		Enter City : <form:input path="city"/><br><br>
		
		<input type = "submit" value = "send">
		
		
		</form:form>
</body>
</html>