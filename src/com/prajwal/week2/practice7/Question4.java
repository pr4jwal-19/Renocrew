package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of N (rows): ");
        int n = inp.nextInt();
        printPattern(n);
    }
    static void printPattern(int n){
        // ulta half pyramid
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
