package com.prajwal.week2.practice7;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        int n = inp.nextInt();
        float[] nums = new float[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter the "+(i+1)+" number: ");
            float num = inp.nextFloat();
            nums[i] = num;
        }
        float result = findAverage(nums);
        System.out.println("The Average of "+n+" numbers : "+result);
    }
    static float findAverage(float ...nums){
        float avg = 0;
        for (float num:nums){
            avg += num;
        }
        return avg/ nums.length;
    }
}
