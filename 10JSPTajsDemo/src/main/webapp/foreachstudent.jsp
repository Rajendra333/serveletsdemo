<%@ page import="java.util.*,com.jsp.tagdemo.Student" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%
List<Student> students = new ArrayList<>();
students.add(new Student("Max", "jones", false));
students.add(new Student("Marry", "jones", true));
students.add(new Student("Miller", "jones", false))	;
pageContext.setAttribute("mystudends", students);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Discount</th>
		</tr>
		<c:forEach var="student" items="${mystudents}">
			<tr>
				<td>${student.firstname}</td>
				<td>${student.lasttname}</td>
				<td>
				<c:if test="${student.above90percent}">
                       yes
                     </c:if>
				<c:if test="${not student.above90percent}">
                     N.A.
                </c:if>
                </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>