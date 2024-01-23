package com.prajwal.week2.practice6;

public class Question3 {
    public static void main(String[] args) {
        // Q3: Calculate the avg marks from an array containing
        // marks of all students in Physics using for-each loop
        int[] marks = {50,68,85,56,60,65,79};
        int sum = 0;
        int noOfStudents = marks.length;
        for (int m: marks){
            sum = sum + m;
        }
        System.out.println("Average marks of "+noOfStudents+" students in Physics : "+(float)(sum/noOfStudents));
    }
}
