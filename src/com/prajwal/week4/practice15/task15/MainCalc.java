package com.prajwal.week4.practice15.task15;

class InvalidInputException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid Input";
    }
    @Override
    public String toString() {
        return "Invalid Input";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String getMessage() {
        return "Cannot divide by zero";
    }
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }
}

class MaximumInputException extends Exception {
    @Override
    public String getMessage() {
        return "Number cannot be greater than 100000";
    }
    @Override
    public String toString() {
        return "Number cannot be greater than 100000";
    }
}

class MaxMultiplierReachedException extends Exception {
    @Override
    public String getMessage() {
        return "Not any multiplier be greater than 7000";
    }
    @Override
    public String toString() {
        return "Not any multiplier be greater than 7000";
    }
}

class Calculator {
    public double add(double num1, double num2) throws InvalidInputException{
        if (num1 == 7 && num2 == 8){
            throw new InvalidInputException();
        }
        return num1 + num2;
    }
    public double subtract(double num1, double num2) throws InvalidInputException{
        if (num1 ==7 && num2 == 8){
            throw new InvalidInputException();
        }
        return num1 - num2;
    }
    public double multiply(double num1, double num2) throws MaxMultiplierReachedException, MaximumInputException {
        if (num1 > 100000 || num2 > 100000) {
            throw new MaximumInputException();
        }
        if (num1 > 7000 || num2 > 7000) {
            throw new MaxMultiplierReachedException();
        }
        return num1 * num2;
    }
    public double divide(double num1, double num2) throws CannotDivideByZeroException {
        if (num2 == 0) {
            throw new CannotDivideByZeroException();
        }
        return num1 / num2;
    }
}

public class MainCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println("Addition: " + calc.add(10, 5));
            System.out.println("Subtraction: " + calc.subtract(10, 5));
            System.out.println("Multiplication: " + calc.multiply(10, 5));
            System.out.println("Division: " + calc.divide(10, 5));

            // try each and every error below by commenting and uncommenting
            //System.out.println("Multiplication: " + calc.multiply(100000, 5));
            //System.out.println("Multiplication: " + calc.multiply(10, 8000));
            //System.out.println("Division: " + calc.divide(10, 0));
        } catch (CannotDivideByZeroException | MaximumInputException | MaxMultiplierReachedException |
                 InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
