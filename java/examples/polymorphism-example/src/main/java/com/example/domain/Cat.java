package com.example.domain;

public class Cat implements Animal {

    @Override
    public void sayHi() {
        System.out.println("meow");
    }

    public void scratch() {
        System.out.println("annoy humans with scratching");
    }

}
