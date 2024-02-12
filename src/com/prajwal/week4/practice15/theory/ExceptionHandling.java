package com.prajwal.week4.practice15.theory;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: "+c);
        } catch (Exception e){
            System.out.println("Failed to divide. Reason : ");
            System.out.println(e);
        }
        // output:
        // Failed to divide. Reason :
        //java.lang.ArithmeticException: / by zero
    }
}
