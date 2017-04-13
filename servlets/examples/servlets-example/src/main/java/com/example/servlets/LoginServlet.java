package com.example.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		

		String username = request.getParameter("dog");
		String password = request.getParameter("cat");

		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("username", username);
		
		//send to homepage
		response.sendRedirect("home.html");
		
	}
	
}
