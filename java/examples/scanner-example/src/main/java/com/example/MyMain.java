package com.example;

import java.util.Scanner;


public class MyMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("Enter something: ");
            String line = scanner.nextLine();
            System.out.println(line);

        }

    }

}
