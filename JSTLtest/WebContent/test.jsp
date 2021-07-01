<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
  	
	<c:set var = "age" scope = "session" value = "${20}"></c:set>
	
	
<%-- 	<c:remove var="age"/> --%>
	
	Your age is : <c:out value="${age}"></c:out><br>
	
	
	<c:choose>
		<c:when test="${age == 18}">
			you are eligible for voter id
		</c:when>
		<c:when test="${age > 18}">you are  eligible </c:when>
		<c:otherwise>
			Child or kid you are
		</c:otherwise>
	</c:choose>
	<br>
	<c:forEach var = "i" begin="1" end="10">
		ForLoop : <c:out value="${i}"></c:out><br>
	</c:forEach>
	
</body>
</html>