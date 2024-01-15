package com.prajwal.task1;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the marks of the 5 subjects (out of 100)\n obtained in your 12th CBSE Board to calculate the percentage (%)");
        System.out.println("Enter the marks obtained in subject 1: ");
        int marks1=inp.nextInt();
        System.out.println("Enter the marks obtained in subject 2: ");
        int marks2=inp.nextInt();
        System.out.println("Enter the marks obtained in subject 3: ");
        int marks3=inp.nextInt();
        System.out.println("Enter the marks obtained in subject 4: ");
        int marks4=inp.nextInt();
        System.out.println("Enter the marks obtained in subject 5: ");
        int marks5=inp.nextInt();
        System.out.println("Percentage obtained is "+calculatePercentage(marks1,marks2,marks3,marks4,marks5)+" %");

    }
    static float calculatePercentage(int sub1,int sub2,int sub3,int sub4,int sub5){
        return (float) (sub1+sub2+sub3+sub4+sub5)/5;
    }
}
