package com.aryankumarofficial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		if (uname.equals("aryan") && pass.endsWith("1234")) {

			HttpSession session = request.getSession();
			session.setAttribute("username", uname);

			response.sendRedirect("welcome.jsp");

		} else {
			response.sendRedirect("login.jsp");
		}

	}

}
