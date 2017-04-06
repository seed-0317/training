package com.example;

public class Example1 {
    public static void main(String[] args) {

        try {

            int x = Integer.parseInt("42a");
            System.out.println(x);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
