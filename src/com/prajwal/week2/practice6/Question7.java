package com.prajwal.week2.practice6;

public class Question7 {
    public static void main(String[] args) {
        // Q7: write a java program to find minimum element
        int[] arr = {45,34,56,67,22,69,-45,23};
        int min = Integer.MAX_VALUE;
        for (int num: arr){
            if (num<min){
                min = num;
            }
        }
        System.out.println("Minimum element from the array : "+min);
    }
}
