<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="currentDate" value="<%=new java.util.Date()%>"/>
	
	  Current date after setting type attribute to date: <br/>
	  <fmt:formatDate type="date" value="${currentDate}" /> <br/>
	  
	  Current date after setting type attribute to time: <br/>
	  <fmt:formatDate type="time" value="${currentDate}" /><br/>
	  
	  Current date after setting type attribute to both: <br/>
	  <fmt:formatDate type="both" value="${currentDate}" /> <br/>
	  
	  Current date after setting pattern attribute: <br/>
	  <fmt:formatDate pattern="yyyy-MM-dd" value="${currentDate}"/>
</body>
</html>