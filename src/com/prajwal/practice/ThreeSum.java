package com.prajwal.practice;

import java.util.Scanner;

public class ThreeSum {
    // Question 1: Sum three numbers
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1= inp.nextInt();
        int num2= inp.nextInt();
        int num3= inp.nextInt();
        System.out.println("Sum of "+num1+", "+num2+", "+num3+" is "+sumOfThreeNos(num1,num2,num3));

    }
    static int sumOfThreeNos(int num1,int num2,int num3){
        return num1+num2+num3;
    }
}
