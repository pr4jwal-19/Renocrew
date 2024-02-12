package com.prajwal.week4.practice15.theory;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] marks = {17,18,12,9,11};

        boolean flag = true;

        while (flag){
            System.out.println("Enter the value of index: ");
            int index = inp.nextInt();

            try {
                System.out.println("Welcome to Nested Try Catch Block !");
                try {
                    System.out.println("Marks of student number "+index+" is : "+marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException aie){
                    System.out.println("Sorry, this index "+index+" doesn't exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e){
                System.out.println("Exception in level 1");
            }
        }

    }
}
