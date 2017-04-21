package com.example.servlets;

import com.example.domain.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/viewAllPeople")
public class PeopleServlet extends HttpServlet {

    // 1. Get list people
    // 2. put people in a scope
    // 3. forward to people.html
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("John",     28));
        peopleList.add(new Person("Amy",      29));
        peopleList.add(new Person("Katie",    30));
        peopleList.add(new Person("Courtney", 25));
        peopleList.add(new Person("Scout",    42));
        peopleList.add(new Person("Austin",   24));

        request.setAttribute("dog", peopleList);
        request.setAttribute("myname", "taylor");

        request.getRequestDispatcher("people.html").forward(request, response);


    }
}
