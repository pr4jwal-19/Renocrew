package com.prajwal.week2.practice6;

public class Question2 {
    public static void main(String[] args) {
        // Q2: write a program to find out whether a no. is in the array or not
        int[] arr = {34,23,10,17,56,39};
        int target = 10;
        if (searchNumber(arr,target)) {
            System.out.println("Target number " + target + " is in the array");
        } else {
            System.out.println("Target number "+ target +" is not present in the array");
        }
    }
    static boolean searchNumber(int[] arr, int target){
        boolean isPresent = false;
        for (int num: arr){
            if (num==target){
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
}
