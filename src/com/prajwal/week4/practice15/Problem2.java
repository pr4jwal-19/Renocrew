package com.prajwal.week4.practice15;

public class Problem2 {
    public static void main(String[] args) {
        // Problem 2:
        try {
            int a = 25;
            int b = 0;
            System.out.println(a/b);
        } catch (IllegalArgumentException iae){
            System.out.println("Hehe...");
        } catch (ArithmeticException ae){
            System.out.println("Haha...");
        }
    }
}
