package com.demo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/Demo")
public class FilterDemo extends HttpFilter implements Filter {
       
    
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filter destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Inside Filter Demo");
		response.getWriter().println("Before Servlet......");
		chain.doFilter(request, response);
		response.getWriter().println("After Servlet......");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Filter Initiallized");
	}

}
