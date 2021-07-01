<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %> 
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
 <c:import   url="books.xml"  var="url" />  
 <x:parse   xml="${url}"   var="doc"   />

 -----------------------------------------------<br>

 <x:forEach   var="n" 
   select="$doc/books/book"> 
 <x:out   select="$n/title"  />
  <br>  
 <x:out   select="$n/author"  />  
  <br>

 ========  
 <br>  
 </x:forEach>
 </body>
 </html>