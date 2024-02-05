package com.prajwal.week4.practice14;

class MyThread1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good Morning !");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Welcome !");
        }
    }
}
public class Problem1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}
