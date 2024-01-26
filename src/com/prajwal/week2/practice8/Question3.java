package com.prajwal.week2.practice8;

class Square{
    int side;

    public void setSide(int side) {
        this.side = side;
    }
    public int calculateArea(int side){
        return side*side;
    }
    public int calculatePerimeter(int side){
        return 4*side;
    }

}
public class Question3 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSide(4);
        System.out.println("Side: "+s1.side);
        System.out.println("Area of Square with side "+s1.side+" : "+s1.calculateArea(s1.side));
        System.out.println("Perimeter of Square with side "+s1.side+" : "+s1.calculatePerimeter(s1.side));
        Square s2 = new Square();
        System.out.println("Area of Square: "+s2.calculateArea(14));
        System.out.println("Perimeter of Square: "+s2.calculatePerimeter(14));
    }
}
