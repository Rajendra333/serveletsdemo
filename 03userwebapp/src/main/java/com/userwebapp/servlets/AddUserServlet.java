package com.userwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection connection;
    
    public void init() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		 connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Raja@4290");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
					
	
		try( 
				Statement statment=connection.createStatement();){
					int result=statment.executeUpdate("insert into user values ('"+firstName+"','"+lastName+"','"+emailId+"','"+ password+"')");
				PrintWriter out=response.getWriter();
				response.setContentType("text/html");
				if(result>0) {
					out.println("<h1>user created in DB</h1>");
				}else {
					out.println("<h1>Error creating in DB</h1>");
				}
					}
				
			catch(SQLException e) {
				e.printStackTrace();		
			}
	}
	
	public void destroy() {
		
			try {
				if(connection!=null);
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
