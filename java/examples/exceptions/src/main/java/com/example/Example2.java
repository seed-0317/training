package com.example;

public class Example2 {
    public static void main(String[] args) throws Exception {

        someMethod();

    }

    public static void someMethod() throws Exception {

        Exception dog = new Exception();
        throw dog;

    }

}
