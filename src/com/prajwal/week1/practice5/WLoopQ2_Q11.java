package com.prajwal.week1.practice5;

import java.util.Scanner;

public class WLoopQ2_Q11 {
    public static void main(String[] args) {
        // Q2: printing sum of first n even natural nos
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = inp.nextInt();
        int sum = 2;
        for (int i=2;i<=n;i++){
            sum=sum+2*i;
        }
        System.out.println("Sum of first "+n+" even natural nos: "+sum);
         // Q11: printing sum of first n even nos using while loop
        int start = 2;
        int wSum = 2;
        while (start<=n){
            wSum=wSum+(2*start);
            start++;
        }
        System.out.println("Sum of first "+n+" even natural nos: "+wSum);
    }
}
