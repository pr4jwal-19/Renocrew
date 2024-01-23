package com.prajwal.week2.practice6;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        // Q5: write a java program to reverse an array
        int[] arr = {23,34,45,55,67,89,99};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr){
        int n = arr.length-1;
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }
}
