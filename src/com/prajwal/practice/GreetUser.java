package com.prajwal.practice;

import java.util.Scanner;

public class GreetUser {
    // question 3: Ask user their name and greets them
    public static void main(String[] args) {
        Scanner sys= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sys.nextLine();
        greetUser(name);
    }
    static void greetUser(String name){
        System.out.println("Hello "+name+", have a good day :) ");
    }
}
