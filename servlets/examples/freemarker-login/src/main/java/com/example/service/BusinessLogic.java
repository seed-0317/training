package com.example.service;

import com.example.domain.Person;

import java.util.HashMap;
import java.util.Map;

public class BusinessLogic {

    private final Map<String, Person> people;

    public BusinessLogic() {

        // Hardcoded data
        people = new HashMap<>();

        people.put("john",     new Person("john",     28));
        people.put("amy",      new Person("amy",      30));
        people.put("austin",   new Person("austin",   25));
        people.put("katie",    new Person("katie",    37));
        people.put("courtney", new Person("courtney", 31));
        people.put("scout",    new Person("scout",    42));
    }

    public Person login(String username) {
        if(username == null || username.isEmpty()) {
            // Could also: throw new IllegalArgumentException();
            return null;
        } else {
            // Should call Dao
            return people.get(username);
        }
    }

}
