<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
	<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	

	<c:set var="number" value="324123.23234"/>
	
    Number after parsing by setting type attribute: <br/>
    
    <fmt:parseNumber  var="num" value="${number}" type="number"/> 
    
    <c:out value="${num}"/><br/>
    
    Number after parsing by setting integerOnly attribute to true: <br/>
    
    <fmt:parseNumber  var="num" value="${number}" integerOnly="true"/> 
    
    <c:out value="${num}"/>
</body>
</html>