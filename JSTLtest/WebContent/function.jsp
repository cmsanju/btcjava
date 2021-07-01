<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="testString" value="Hello this is a JSTL function example."/>
 
		<c:if test="${fn:contains(testString, 'JSTL')}">
		   <h4>String JSTL found in the test string.</h4>
		</c:if>
 
		<c:if test="${fn:containsIgnoreCase(testString, 'jstl')}">
		   <h4>String jstl found in the test string.</h4>
		</c:if>
		
</body>
</html>