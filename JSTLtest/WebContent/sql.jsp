<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/java"  
     user="root"  password="password"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from employee11 
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>Emp Name</th>  
<th>Emp Company</th>
<th>Emp Salary</th>  

  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.empname}"/></td>  
<td><c:out value="${table.empcomp}"/></td>
<td><c:out value="${table.empsalary}"/></td>  
 

</tr>  
</c:forEach>  
</table>
</body>
</html>