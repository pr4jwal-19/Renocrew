package com.prajwal.week1.practice1;

import java.util.Scanner;

public class CalculateCgpa {
    // question 2: calculate CGPA from the marks of three subjects
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects(out of 100) : ");
        int sub1 = inp.nextInt();
        int sub2 = inp.nextInt();
        int sub3 = inp.nextInt();
        System.out.println("CGPA out of 10: "+calculateCgpaOutOfTen(sub1,sub2,sub3));
    }
    static float calculateCgpaOutOfTen(int sub1,int sub2,int sub3){
        return (float) (sub1+sub2+sub3)/30;
    }
}
