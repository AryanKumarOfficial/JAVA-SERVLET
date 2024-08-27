package com.aryankumarofficial;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// JSTL - JSP standard Tag Library
		String name = "aryan";

		List<Student> studs = Arrays.asList(new Student(101, "Aryan"), new Student(102, "Verandra"),
				new Student(103, "Ramesh"));

		Student student = new Student(10, "Joseph");
		request.setAttribute("name", name);
		request.setAttribute("student", student);
		request.setAttribute("students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);

	}
}
