package com.example;

public class Example1 {
    public static void main(String[] args) {

        int x = 1;
        x++;
        x++;

        int[] array = new int[]{1,2,3};
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

    }
}
