package com.aryankumarofficial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		out.print("hi ");

//		ServletContext context = getServletContext(); 
		ServletConfig context = getServletConfig(); 
		String str = context.getInitParameter("name");
		out.print(str);

	}

}
