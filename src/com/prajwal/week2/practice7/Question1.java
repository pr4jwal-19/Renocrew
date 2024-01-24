package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = inp.nextInt();
        printTable(number);
    }
    static void printTable(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
