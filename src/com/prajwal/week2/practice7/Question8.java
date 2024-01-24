package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of N(rows): ");
        int n = inp.nextInt();
        printPatternRecursive(n);
    }
    static void printPatternRecursive(int n){
        if (n>0){
            printPatternRecursive(n-1);
            for (int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // printPatternRecursive(4) -> printPatternRecursive(3) + 4 times * and new line
    // printPatternRecursive(2) + 3 times * and new line -> printPatternRecursive(1) + 2 times * and new line
    // printPatternRecursive(0) + 1 times * and new line
}
