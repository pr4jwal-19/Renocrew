package com.prajwal.week2.practice6;

public class Question8 {
    public static void main(String[] args) {
        // Q8: find whether the given array is sorted or not
        int[] arr = {-434,1,34,56,78,80,266};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
