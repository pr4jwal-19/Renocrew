package com.prajwal.practice5;

import java.util.Scanner;

public class SumOfTable8Q9 {
    public static void main(String[] args) {
        // Q9: printing the sum of contents of table 8
        int n = 8;
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum=sum+(n*i);
        }
        System.out.println(""+sum);
    }
}
