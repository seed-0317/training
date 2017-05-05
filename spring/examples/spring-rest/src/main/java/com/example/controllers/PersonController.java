package com.example.controllers;

import com.example.model.Chad;
import com.example.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity whateverYouWant() {
        Person person = new Person("john", 28);
        return ResponseEntity.ok().body(person);
    }

    @RequestMapping(method= RequestMethod.POST)
    public ResponseEntity whateverYouWant2(@RequestBody Chad chad) {

        System.out.println(chad);

        return ResponseEntity.ok().body(chad);
    }













//    @RequestMapping(value = "/jaguar", method=RequestMethod.GET)
//    public String test() {
//        return "ALLO world, pretty cool api eh?";
//    }

}
