package com.aryankumarofficial;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aryankumarofficial.dao.AlienDao;
import com.aryankumarofficial.model.Alien;

@WebServlet("/getAlien")
public class GetAlienController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int aid = Integer.parseInt(request.getParameter("aid"));

		AlienDao dao = new AlienDao();

		Alien alien = dao.getAlien(aid);

		request.setAttribute("alien", alien);

		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
	}

}
