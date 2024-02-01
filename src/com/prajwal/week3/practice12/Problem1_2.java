package com.prajwal.week3.practice12;

// Q1: creating the abstract class Pen
abstract class Pen{
    abstract void write();
    abstract void refill();
}
// Q2:  adding a concrete class FountainPen that extends Pen with an additional method
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Writing....");
    }
    @Override
    void refill() {
        System.out.println("Refilling....");
    }
    void changeNib(){
        System.out.println("Changing the Nib....");
    }
}
public class Problem1_2 {
    public static void main(String[] args) {
        FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.changeNib();
    }
}
