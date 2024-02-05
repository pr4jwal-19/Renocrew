package com.prajwal.week4.practice14;

class SomeThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is some Thread");
    }
}
public class Problem4_5 {
    public static void main(String[] args) {
        SomeThread someThread = new SomeThread();
        SomeThread someThread1 = new SomeThread();
        System.out.println("State of given Thread: "+someThread1.getState());
        someThread.start();
        System.out.println("State of given Thread: "+someThread.getState());
        // This is how we get the reference to the current Thread
        System.out.println(Thread.currentThread().getState());
    }
}
