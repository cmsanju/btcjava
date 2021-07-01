<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/custom.tld" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<x:eveng></x:eveng>
		
		<jsp:useBean id="emp" class = "com.test.Employee"></jsp:useBean>
		
		<jsp:setProperty property="id" name="emp" value="101"/>
		<jsp:setProperty property="name" name="emp" value="jAVA"/>
		<jsp:setProperty property="salary" name="emp" value="1234.78"/>
		
		<jsp:getProperty property="id" name="emp"/>
		<jsp:getProperty property="name" name="emp"/>
		<jsp:getProperty property="salary" name="emp"/>
		
		
</body>
</html>