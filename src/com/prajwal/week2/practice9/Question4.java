package com.prajwal.week2.practice9;

class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        this.length = 4;
        this.width = 5;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Length of Rectangle with default Constructor: "+rect.getLength());
        System.out.println("Width of Rectangle with default Constructor: "+rect.getWidth());
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Length of Rectangle with overloaded Constructor: "+rectangle.getLength());
        System.out.println("Width of Rectangle with overloaded Constructor: "+rectangle.getWidth());
    }
}
