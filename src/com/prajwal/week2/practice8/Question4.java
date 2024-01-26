package com.prajwal.week2.practice8;

class Rectangle{
    int length;
    public void setLength(int length) {
        this.length = length;
    }

    int width;
    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(){
        return length*width;
    }
    public int calculatePerimeter(){
        return 2*length*width;
    }

}
public class Question4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(12);
        rect.setWidth(14);
        System.out.println("Area: "+rect.calculateArea()+" for length: "+rect.length+" and width: "+rect.width);
        System.out.println("Perimeter: "+rect.calculatePerimeter()+" for length: "+rect.length+" and width: "+rect.width);
    }
}
