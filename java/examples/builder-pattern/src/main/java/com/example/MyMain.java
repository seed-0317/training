package com.example;

import com.example.domain.Person;

public class MyMain {
    public static void main(String[] args) {

        /**
         * Using complicated constructor
         */

        Person john = new Person("john", null, "smith", 28, null, null, 72);
        System.out.println(john);

        /**
         * Using the Builder Design Pattern
         */
        Person amy = new Person.Builder()
                                    .first("amy")
                                    .last("smith")
                                    .age(27)
                                    .height(72)
                                    .build();
        System.out.println(amy);

    }
}
