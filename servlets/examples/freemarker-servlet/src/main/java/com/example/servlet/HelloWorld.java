package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.domain.Person;

@WebServlet(value="/dog")
public class HelloWorld extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person john = new Person("john", 28);
        
        request.setAttribute("user", john);
		//request.getSession().setAttribute("user", john); //HttpSession example
		
        
        request.getRequestDispatcher("hello-world.html").forward(request, response);
	}
	
	
}
