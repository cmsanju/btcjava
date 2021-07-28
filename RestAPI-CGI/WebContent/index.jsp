<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>welcome to rest API service provider</h1>
		
		<a href = "rest/hello">click here</a><br><br>
		
		<form action="rest/hello/user">
		
		Enter UserName:<input type = "text" name = "user"><br><br>
		Enter Password:<input type = "password" name = "pass"><br><br>
		
				<input type = "submit" value = "send">
		</form>
</body>
</html>