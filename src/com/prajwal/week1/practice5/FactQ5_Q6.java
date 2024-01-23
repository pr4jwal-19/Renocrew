package com.prajwal.week1.practice5;

import java.util.Scanner;

public class FactQ5_Q6 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = inp.nextInt();
        int fact = 1;
        for (int i = 2;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" = "+fact);

        // Q6: Factorial of number using while loop
        int start = 2;
        int factorial = 1;
        while (start<=n){
            factorial=factorial*start;
            start++;
        }
        System.out.println("Factorial of "+n+" using while loop is "+factorial);
    }
}
