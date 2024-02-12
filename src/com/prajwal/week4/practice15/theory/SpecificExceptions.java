package com.prajwal.week4.practice15.theory;

import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] marks = {5,10,15};

        System.out.println("Enter the array index you want to access: ");
        int index = inp.nextInt();

        System.out.println("Enter the number with you want to divide: ");
        int num = inp.nextInt();

        try {
            System.out.println("The marks at index "+index+" entered is : "+marks[index]);
            System.out.println("The value after dividing the marks at "+index+" by the number "+num+" is "+marks[index]/num);
        } catch (ArithmeticException ae){
            System.out.println("ArithmeticException Occurred !");
        } catch (ArrayIndexOutOfBoundsException aio){
            System.out.println("ArrayIndexOutOfBoundsException Occurred !");
        } catch (Exception e){
            System.out.println("Some other exception occurred !");
        }
    }
}
