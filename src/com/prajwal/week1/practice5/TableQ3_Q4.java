package com.prajwal.week1.practice5;

import java.util.Scanner;

public class TableQ3_Q4 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        // Q3: printing table of n
        System.out.println("Enter the value of n: ");
        int n = inp.nextInt();
        for (int i=1;i<=12;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }

        // Q4: to print table of 10 in reverse
        int num =10;
        System.out.println("**** Printing the table of 10 in reverse order ****");
        for (int i=10;i>=1;i--){
            System.out.println(num+"X"+i+"="+num*i);
        }

    }
}
