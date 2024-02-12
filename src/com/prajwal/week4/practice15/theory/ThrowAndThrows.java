package com.prajwal.week4.practice15.theory;

class NegativeInputException extends Exception{
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }

    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
}
public class ThrowAndThrows {
    public static void main(String[] args) {
        // Tejas uses the fn made by Prajwal
        try {
            int res = divide(10,2);
            System.out.println(res);
            System.out.println("Area: "+area(5));
        } catch (Exception e){
            System.out.println("Exception occurred");
        }

    }
    static int divide(int a, int b) throws ArithmeticException{
        // made by prajwal
        return a/b;
    }
    static double area(int radius) throws NegativeInputException{
        if (radius<0){
            throw new  NegativeInputException();
        }
        return Math.PI*radius*radius;
    }
}
