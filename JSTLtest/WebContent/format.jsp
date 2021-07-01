<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="num" value="324123.23234" />
	Number after setting type attribute:
	<br />
	<fmt:formatNumber value="${num}" type="currency" />
	<br /> Number after setting maxIntegerDigits and maxFractionDigits
	attribute:
	<br />
	<fmt:formatNumber type="number" maxIntegerDigits="4"
		maxFractionDigits="3" value="${num}" />
	<br /> Number after setting pattern attribute:
	<br />
	<fmt:formatNumber type="number" pattern="##,###.##" value="${num}" />
</body>
</html>