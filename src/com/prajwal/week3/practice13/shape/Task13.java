package com.prajwal.week3.practice13.shape;

class Rectangle{
    protected int length;
    protected int width;

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

    public int calArea(){
        return length*width;
    }

}
class Square{
    protected int side;
    public Square(int side){
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public int calArea(){
        return side*side;
    }
}
class Circle{
    protected float radius;
    public float getRadius() {
        return radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }
    public float calArea(){
        return (float) Math.PI*this.radius*this.radius;
    }

}
class Sphere extends Circle{

    public Sphere(int r){
        super(r);
    }
    @Override
    public float calArea(){
        return (float) (4*Math.PI*radius*radius);
    }
    public float calculateVolume(){
        return (float) (4/3*Math.PI*radius*radius*radius);
    }
}
class Cylinder extends Circle {
    protected float height;

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    @Override
    public float calArea(){
        return (float) (2*Math.PI*radius*height + 2*Math.PI*radius*radius);
    }
    public float calVolume(){
        return (float) (Math.PI*radius*radius*height);
    }

}
public class Task13 {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("Area of Square: "+square.calArea());
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Area of rectangle: "+rectangle.calArea());
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: "+circle.calArea());
        Sphere sphere = new Sphere(5);
        System.out.println("Area of Sphere: "+sphere.calArea());
        System.out.println("Volume of Sphere: "+sphere.calculateVolume());
        Cylinder cylinder = new Cylinder(5,15);
        System.out.println("Area of Cylinder: "+cylinder.calArea());
        System.out.println("Volume of Cylinder: "+cylinder.calVolume());
    }
}
