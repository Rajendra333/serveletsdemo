<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Time on Server is <%= new java.util.Date() %>

<br/><b/>
<% java.util.Date mydate=new java.util.Date(); %>
My date=<%=mydate%>

<br/><b/>
<c:set var="mynewdate" value="<%=new java.util.Date() %>"/>
time on server is ${mynewdate}

</body>
</html>