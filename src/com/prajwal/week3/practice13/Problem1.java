package com.prajwal.week3.practice13;

class Calculator{
    public void add(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
}
class SciCalculator{
    public void calculateSin(int num){
        System.out.println("Sine of number: "+Math.sin(num));
    }
}
class HybCalculator{
    public void calculateBoth(int a,int b){
        System.out.println("Sine of sum of two: "+Math.sin(a+b));
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(3,5);
        SciCalculator sciCalculator = new SciCalculator();
        sciCalculator.calculateSin(45);
        HybCalculator hybCalculator = new HybCalculator();
        hybCalculator.calculateBoth(30,15);
    }
}
