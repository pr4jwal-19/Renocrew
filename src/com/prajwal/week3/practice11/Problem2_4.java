package com.prajwal.week3.practice11;

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
class Cuboid extends Rectangle{
    protected  int height;

    public Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int calArea(){
        return 2*(length*width + width*height + height*length);
    }

    public int calVolume(){
        return length*width*height;
    }

}
public class Problem2_4 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(12,20);
        System.out.println("Area of Rectangle: "+obj1.calArea()+
                " with width and length: "+obj1.getWidth()+
                " and "+obj1.getLength());
        Cuboid obj2 = new Cuboid(12,20,32);
        System.out.println("Area of Cuboid: "+obj2.calArea()+
                " with width, length and height: "+obj2.getWidth()+
                " and "+obj2.getLength()+" and "+obj2.getHeight());
        System.out.println("Volume of Cuboid: "+obj2.calVolume()+" with length,width and height: "
                +obj2.getLength()+" and "+obj2.getWidth()+" and "+obj2.getHeight());
    }
}
