package com.example.main;

import com.example.domain.Animal;
import com.example.domain.Cat;

public class MyMain {

    public static void main(String[] args) {
        Animal a = new Cat();
        a.sayHi();

        a.scratch();

    }

}
