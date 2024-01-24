package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of N(rows): ");
        int n = inp.nextInt();
        printPatternRecursive(n);
    }
    static void printPatternRecursive(int n){
        if (n>0){
            for (int i = n; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
            printPatternRecursive(n-1);
        }
    }
}
