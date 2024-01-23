package com.prajwal.week1.practice1;

import java.util.Scanner;

public class CheckNumberIsInteger {
    // check number is integer or not
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter any integer: ");
        System.out.println(inp.hasNextInt());
    }
}
