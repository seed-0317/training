package com.example;

import java.util.Comparator;

public class PersonScoreComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return (int)(o1.getScore() - o2.getScore());
    }

}
