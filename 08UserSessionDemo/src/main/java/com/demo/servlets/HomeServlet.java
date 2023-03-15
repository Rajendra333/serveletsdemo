package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String username=(String) session.getAttribute("username");
		System.out.println("username="+username);
		if(username==null) {
			out.println("user not found in session");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}else {
			out.println("user found in session -"+username);
			String favcolour=null;
			for(Cookie cookie : request.getCookies()) {
				if (cookie.getName().equalsIgnoreCase(favcolour));
				favcolour=cookie.getValue();
			}
			out.println("<br><p>Users Fav colour="+favcolour);
		}

		
		out.println(request.getAttribute("message"));
	}

}
