package com.prajwal.practice4;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter marks obtained in three subjects to check whether pass or fail: ");
        System.out.println("Enter marks of subject 1: ");
        byte marks1 = inp.nextByte();
        System.out.println("Enter marks of subject 2: ");
        byte marks2 = inp.nextByte();
        System.out.println("Enter marks of subject 3: ");
        byte marks3 = inp.nextByte();

        float avg = (marks1+marks2+marks3)/3.0f;

        if (avg>=40 && marks1>=33 && marks2>=33 && marks3>=33){
            System.out.println("Congratulations ! You are passed.");
        }
        else {
            System.out.println("Sorry, You are failed.");
        }
    }
}
