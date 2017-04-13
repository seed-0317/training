package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/cat")
public class PrintWriterExample extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = "john";

		PrintWriter printWriter = response.getWriter();

		printWriter.write("<h1>hello from " + name + "</h1>");
		printWriter.write("<p>this seems like a neat way of doing things</p>");		
		

	}
	
}
