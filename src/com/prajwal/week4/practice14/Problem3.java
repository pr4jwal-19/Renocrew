package com.prajwal.week4.practice14;

class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Good Morning !");
    }
}
class MyThread6 extends Thread{
    @Override
    public void run() {
        System.out.println("Welcome !");
    }
}
public class Problem3 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        MyThread6 myThread6 = new MyThread6();
        myThread5.setPriority(4);
        myThread6.setPriority(8);
        myThread5.start();
        myThread6.start();
        System.out.println("Priority: "+myThread5.getPriority());
        System.out.println("Priority: "+myThread6.getPriority());
    }
}
