package com.aryankumarofficial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class NameFilter
 */
@WebFilter("/addAlien")
public class NameFilter extends HttpFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filtering name...");
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;

		String name = req.getParameter("aname");
		if (name.length() >= 3)
			chain.doFilter(request, response);
		else
			out.println("Too small!!");

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
