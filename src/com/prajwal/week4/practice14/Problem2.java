package com.prajwal.week4.practice14;

class MyThread3 extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good Morning !");
        }
    }
}
class MyThread4 extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome !");
        }
    }
}
public class Problem2 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        MyThread4 myThread4 = new MyThread4();
        myThread3.start();
        myThread4.start();
    }
}
