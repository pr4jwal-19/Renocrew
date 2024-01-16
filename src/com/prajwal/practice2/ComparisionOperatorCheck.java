package com.prajwal.practice2;

import java.util.Scanner;

public class ComparisionOperatorCheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = inp.nextInt();
        System.out.println(num+" is greater than 15: "+(num>15));
    }
}
