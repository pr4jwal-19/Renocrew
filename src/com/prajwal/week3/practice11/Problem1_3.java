package com.prajwal.week3.practice11;

class Circle{
    protected float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float calArea(){
        return (float) Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
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
public class Problem1_3 {
    public static void main(String[] args) {
        // Q1:
        Circle circle = new Circle(12.65f);
        System.out.println("Area of Circle: "+circle.calArea());
        Cylinder cylinder = new Cylinder(12.65f,16.55f);
        System.out.println("Area of Cylinder: "+cylinder.calArea());
        System.out.println("Volume of Cylinder: "+cylinder.calVolume());
    }
}
