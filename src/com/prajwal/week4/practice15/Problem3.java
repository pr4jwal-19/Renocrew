package com.prajwal.week4.practice15;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[] arr = {3,4,12,15,18};

        int limit = 0;
        boolean flag = true;

        while (flag && limit<5){
            try {
                System.out.println("Enter a valid index : ");
                int index = inp.nextInt();
                System.out.println("Value of arr["+index+"] = "+arr[index]);
                flag = false;
            } catch (Exception e){
                System.out.println("Invalid index");
                limit++;
            }
        }
        System.out.println("Error !");
    }
}
