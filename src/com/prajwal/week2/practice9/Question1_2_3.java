package com.prajwal.week2.practice9;

class Cylinder{

    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder(){

    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float calculateSurfaceArea(){
        return (float) (2*Math.PI*radius*radius+2*Math.PI*radius*height);
    }
    public float calculateVolume(){
        return (float) (Math.PI*radius*radius*height);
    }

}
public class Question1_2_3 {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        // Q1:
        cl.setHeight(34.56f);
        System.out.println("Height: "+cl.getHeight());
        cl.setRadius(25.50f);
        System.out.println("Radius: "+cl.getRadius());
        // Q2:
        System.out.println("Surface Area: "+cl.calculateSurfaceArea());
        System.out.println("Volume: "+cl.calculateVolume());
        // Q3:
        Cylinder myCl = new Cylinder(20,34.5f);
        System.out.println("Height: "+myCl.getHeight());
        System.out.println("Radius: "+myCl.getRadius());
        System.out.println("Surface Area: "+myCl.calculateSurfaceArea());
        System.out.println("Volume: "+myCl.calculateVolume());
    }
}
