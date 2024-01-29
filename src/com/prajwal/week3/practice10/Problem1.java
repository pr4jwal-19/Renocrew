package com.prajwal.week3.practice10;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printSomething(){
        System.out.println("This is the Base class method !");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
public class Problem1 {
    public static void main(String[] args) {
        // creating object of Base class
        Base obj1 = new Base();
        obj1.setX(26);
        // creating object of Derived class
        Derived obj2 = new Derived();
        obj2.setY(28);
        System.out.println(obj1.getX());
        System.out.println(obj2.getY());
    }
}
