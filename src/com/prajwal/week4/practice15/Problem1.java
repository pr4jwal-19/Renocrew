package com.prajwal.week4.practice15;

public class Problem1 {
    public static void main(String[] args) {
        // Problem 1:
        /* Syntactical error
        num = 12;
        System.out.println(num);
         */
        // logical error
        int radius = 4;
        double area = 3.14*radius*radius; // should use Math.PI instead
        System.out.println(area);
        // runtime exception
        System.out.println(2/0);
    }
}
