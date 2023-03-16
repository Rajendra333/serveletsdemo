<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
   Connection con;
   PreparedStatement ps;
   
   public void jspInit(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Raja@4290");
		ps=con.prepareStatement("Insert into account values(?, ?, ?, ?)");
	}catch(Exception e){
		e.printStackTrace();
	}
  }
   public void jspDestroy() {
	  try{ 
		  ps.close();
		  con.close();
	  }catch(Exception e){
		  e.printStackTrace();
	  }
   }
   
%>

<%
   int account=Integer.parseInt(request.getParameter("account"));
   String firstname=request.getParameter("firstname");
   String lastname=request.getParameter("lastname");
   int bal=Integer.parseInt(request.getParameter("bal"));
   
   ps.setInt(1,account);
   ps.setString(2,firstname);
   ps.setString(3,lastname);
   ps.setInt(4,bal);
   
   ps.executeUpdate();
%>
<%@ include file="openaccount.html" %>
</body>
</html>