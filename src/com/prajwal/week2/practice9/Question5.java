package com.prajwal.week2.practice9;

class Sphere{
    private float radius;
    public Sphere() {
        this.radius = 5.0f;
    }
    public Sphere(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    public float calculateSurfaceArea(){
        return (float) (4*Math.PI*radius*radius);
    }
    public float calculateVolume(){
        return (float) (4/3*Math.PI*radius*radius*radius);
    }
}
public class Question5 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        Sphere sp = new Sphere(13);
        // Q1:
        System.out.println("Surface Area of Sphere with default Constructor: "+sphere.calculateSurfaceArea());
        System.out.println("Volume of Sphere with default Constructor: "+sphere.calculateVolume());
        // Q2:
        System.out.println("Surface Area of Sphere with overloaded Constructor: "+sp.calculateSurfaceArea());
        System.out.println("Volume of Sphere with overloaded Constructor: "+sp.calculateVolume());
    }
}
