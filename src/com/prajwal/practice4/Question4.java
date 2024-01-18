package com.prajwal.practice4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the day (from 1 to 7) of the week: ");
        byte day = inp.nextByte();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
