package com.example.controllers;

import com.example.domain.Person;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonController {

    @GET
    @Path("/{name}")
    public Response getPerson(@PathParam("name") String name) {
        Person person = new Person(name, 28);
        return Response.status(200).entity(person).build();
    }

    @POST
    public Response createPerson(Person person) {
        System.out.println(person);
        if(person == null) {
            return Response.status(400).entity("").build();
        }

        return Response.status(201).entity(person).build();
    }

}
