package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // fibonacci series -> 0 1 1 2 3 5 8 13 21 34 ......
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int num = inp.nextInt();
        System.out.println(printFibonacci(num));
    }
    static int printFibonacci(int num){
        if (num==1 || num==2){
            return num-1;
        }
        return printFibonacci(num-1)+printFibonacci(num-2);
    }
}
