package com.prajwal.week4.practice17.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Problem 1
        ArrayList<String> names = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter names of 10 students: ");
        int count = 0;
        while (count<10){
            System.out.println("Enter name: ");
            String name = inp.nextLine();
            names.add(name);
            count++;
        }
        for (String n: names){
            System.out.println("Student - "+(names.indexOf(n)+1)+" : "+n);
        }
    }
}
