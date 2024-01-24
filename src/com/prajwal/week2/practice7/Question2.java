package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of N (rows): ");
        int n = inp.nextInt();
        printPattern(n);
    }
    static void printPattern(int n){
        // half pyramid
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
