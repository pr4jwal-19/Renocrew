package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = inp.nextInt();
        System.out.println("The Sum of natural numbers till "+n+" : "+sumOfNaturalNumsRecursive(n));
    }
    static int sumOfNaturalNumsRecursive(int limit){
        // base condition -> limit will stop at 1
        if (limit==1){
            return 1;
        }
        return limit+(sumOfNaturalNumsRecursive(limit-1));
    }
}
