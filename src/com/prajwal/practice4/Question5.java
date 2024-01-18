package com.prajwal.practice4;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the correct year\n to check whether leap year or not: ");
        int year = inp.nextInt();
        if (leapYearOrNot(year)){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
    static boolean leapYearOrNot(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
