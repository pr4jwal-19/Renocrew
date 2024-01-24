package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = inp.nextInt();
        System.out.println("Sum of "+n+" natural numbers : "+sumOfNaturalNos(n));
    }
    static int sumOfNaturalNos(int n){
        return n*(n+1)/2;
    }
}
