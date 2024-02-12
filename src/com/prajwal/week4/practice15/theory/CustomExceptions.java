package com.prajwal.week4.practice15.theory;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = inp.nextInt();

        if (num > 10){
            try {
                throw new MyException();
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Actually finished");
        }
        else {
            System.out.println("Finished");
        }
    }
}
