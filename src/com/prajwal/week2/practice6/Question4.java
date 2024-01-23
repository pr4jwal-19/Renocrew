package com.prajwal.week2.practice6;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        // Q4: Create a java program to add two matrices of size 2X3
        // 2 x 3 matrix 1
        int[][] arr1 = {
                {23,34,56},
                {45,52,69}
        };
        // 2 X 3 matrix 2
        int[][] arr2 = {
                {40,50,60},
                {70,80,90}
        };
        int[][] result = new int[2][3];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
