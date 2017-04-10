package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        list.add(new Person("john",     29, 80));
        list.add(new Person("amy",      35, 90));
        list.add(new Person("austin",   28, 100));
        list.add(new Person("katie",    27, 100));
        list.add(new Person("courtney", 26, 90));
        list.add(new Person("scout",    25, 75));

        for(Person temp : list) {
            System.out.println(temp);
        }

        Collections.sort(list, new PersonScoreComparator());

        System.out.println();
        for(Person temp : list) {
            System.out.println(temp);
        }




    }

}
