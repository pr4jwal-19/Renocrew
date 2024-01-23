package com.prajwal.week2.practice6;

public class Question6 {
    public static void main(String[] args) {
        // Q6: write a java program to find maximum element in an array
        int[] arr = {45,34,56,67,22,69,23};
        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if (num>max){
                max = num;
            }
        }
        System.out.println("Maximum element from the array : "+max);
    }
}
