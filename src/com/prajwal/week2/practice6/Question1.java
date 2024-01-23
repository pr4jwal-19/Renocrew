package com.prajwal.week2.practice6;

public class Question1 {
    public static void main(String[] args) {
        // Q1: write an array of float of 5 nos and print their sum
        float[] nums = {20.34f,56.45f,67.56f,78.56f,99.99f};
        float sum = 0;
        for (float n:nums){
            sum = sum+n;
        }
        System.out.println("Sum of 5 nos: "+sum);

    }
}
